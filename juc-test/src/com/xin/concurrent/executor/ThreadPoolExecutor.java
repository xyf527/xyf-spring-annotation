package com.xin.concurrent.executor;

import com.xin.concurrent.exception.ConcurrentException;
import com.xin.concurrent.policy.RejectHandler;
import com.xin.concurrent.queue.ConcurrentQueue;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/**
 * @author XYF
 * @date 2025-12-07 12:02
 */

public class ThreadPoolExecutor implements Executor {

    // 任务队列
    private final ConcurrentQueue<Runnable> workQueue;
    // 线程集合
    private final Set<WorkerThread> workerThreads = new HashSet<>();
    // 线程核心数
    private final int coreSize;
    // 最大线程数
    private final int maximumSize;
    // 获取任务超时时间
    private final long timeout;
    // 获得任务超时时间的单位
    private final TimeUnit timeUnit;
    // 拒绝策略
    private final RejectHandler rejectHandler;
    // 运行状态
    private volatile boolean running = true;

    public ThreadPoolExecutor(int coreSize, int maximumSize, long timeout, TimeUnit timeUnit, ConcurrentQueue<Runnable> workQueue) {
        this(coreSize, maximumSize, timeout, timeUnit, workQueue, new AbortPolicy());
    }

    public ThreadPoolExecutor(int coreSize, int maximumSize, long timeout, TimeUnit timeUnit, ConcurrentQueue<Runnable> workQueue, RejectHandler rejectHandler) {
        if (coreSize <= 0 || maximumSize <= 0 || maximumSize < coreSize) {
            throw new IllegalArgumentException();
        }
        this.coreSize = coreSize;
        this.maximumSize = maximumSize;
        this.timeout = timeout;
        this.timeUnit = timeUnit;
        this.rejectHandler = rejectHandler;
        this.workQueue = workQueue;
    }

    @Override
    public void execute(Runnable task) {
        // 获取任务数 也就是线程池中目前存在的线程数
        int taskCount = workerThreads.size();
        // 1.任务数没有超过coreSize 创建workerThread执行
        if (taskCount < coreSize) {
            createNewThread(task, true); // 核心线程
            // 2.任务数大于coreSize并且小于maximumSize
        } else if (taskCount < maximumSize) {
            // 目前队列还有容量 向队列中添加元素
            if (workQueue.size() < workQueue.capacity()) { // 2.1队列不满 向队列中添加元素
                workQueue.put(task);
            } else { // 2.2队列已满 继续创建新的线程执行任务
                createNewThread(task, false); // 非核心线程
            }
        } else { // 3.队列已满 同时达到最大线程数 则执行拒绝策略
            rejectHandler.reject(task, this);
        }
    }

    private void createNewThread(Runnable task, boolean coreThread) {
        WorkerThread workerThread = new WorkerThread(task, coreThread);
        workerThreads.add(workerThread);
        workerThread.start();
    }

    public ConcurrentQueue<Runnable> getQueue() {
        return workQueue;
    }

    @Override
    public void shutdown() {
        for (; ; ) {
            if (workQueue == null || workQueue.size() == 0/**/) {
                break;
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new ConcurrentException(e);
            }
        }
        this.workerThreads.clear();
        this.running = false;
    }

    // 用提交任务的线程执行任务
    public static class CallerRunsPolicy implements RejectHandler {
        @Override
        public void reject(Runnable r, ThreadPoolExecutor executor) {
            r.run();
        }
    }

    // 直接抛出异常
    public static class AbortPolicy implements RejectHandler {
        @Override
        public void reject(Runnable r, ThreadPoolExecutor executor) {
            throw new RejectedExecutionException("Task" + r.toString() + " rejected from " + executor.toString());
        }
    }

    // 忽略任务
    public static class DiscardPolicy implements RejectHandler {
        @Override
        public void reject(Runnable r, ThreadPoolExecutor executor) {

        }
    }

    // 移除队列中存放最久的任务
    public static class DiscardOrderestPolicy implements RejectHandler {
        @Override
        public void reject(Runnable r, ThreadPoolExecutor executor) {
            executor.getQueue().take();
            executor.execute(r);
        }
    }

    class WorkerThread extends Thread {
        private Runnable task;
        private final boolean coreThread;

        WorkerThread(Runnable task, boolean coreThread) {
            this.task = task;
            this.coreThread = coreThread;
        }

        @Override
        public void run() {
            if (coreThread) {
                while (running) {
                    runTask();
                }
            } else {
                runTask();
                workerThreads.remove(this);
            }
        }

        private void runTask() {
            while (task != null || (task = workQueue.poll(timeout, timeUnit)) != null) {
                try {
                    task.run();
                } catch (Exception e) {
                    throw new ConcurrentException(e);
                } finally {
                    task = null;
                }
            }
        }
    }
}
