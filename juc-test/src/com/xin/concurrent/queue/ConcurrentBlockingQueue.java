package com.xin.concurrent.queue;

import com.xin.concurrent.exception.ConcurrentException;
import com.xin.concurrent.policy.RejectHandler;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author XYF
 * @date 2025-12-07 11:43
 */

public class ConcurrentBlockingQueue<T> implements ConcurrentQueue<T> {

    // ArrayBlockingQueue队列
    private final BlockingQueue<T> queue;

    // ReentrantLock锁
    private final ReentrantLock lock = new ReentrantLock();

    // 消费者可以消费
    private final Condition notEmpty = lock.newCondition();

    // 生产者可以生产
    private final Condition notFull = lock.newCondition();

    // 队列容量
    private final int capcity;

    // 拒绝策略
    private RejectHandler rejectHandler;

    public ConcurrentBlockingQueue(int capcity) {
        if (capcity <= 0) {
            throw new IllegalArgumentException();
        }
        this.capcity = capcity;
        this.queue = new ArrayBlockingQueue<>(capcity);
    }

    @Override
    public T poll(long timeout, TimeUnit timeUnit) {
        lock.lock();
        try {
            // 转换为纳秒
            long nanos = timeUnit.toNanos(timeout);
            // 是否为空
            while (queue.isEmpty()) {
                if (nanos <= 0) {
                    return null;
                }
                nanos = notEmpty.awaitNanos(nanos);
            }
            T t = queue.remove();
            notFull.signal();
            return t;
        } catch (Exception e) {
            throw new ConcurrentException(e);
        } finally {
            lock.unlock();
        }
    }

    @Override
    public T take() {
        lock.lock();
        try {
            while (queue.isEmpty()) {
                notEmpty.await();
            }
            T t = queue.remove();
            notFull.signal();
            return t;
        } catch (Exception e) {
            throw new ConcurrentException(e);
        } finally {
            lock.unlock();
        }
    }

    @Override
    public void put(T task) {
        lock.lock();
        try {
            while (queue.size() == capcity) {
                notFull.await();
            }
            queue.add(task);
            notEmpty.signal();
        } catch (Exception e) {
            throw new ConcurrentException(e);
        } finally {
            lock.unlock();
        }
    }

    @Override
    public boolean offer(T task, long timeout, TimeUnit unit) {
        lock.lock();
        try {
            long nanos = unit.toNanos(timeout);
            while (queue.size() == capcity) {
                if (nanos <= 0) {
                    return false;
                }
                nanos = notFull.awaitNanos(nanos);
            }
            queue.add(task);
            notEmpty.signal();
            return true;
        } catch (Exception e) {
            throw new ConcurrentException(e);
        } finally {
            lock.unlock();
        }
    }

    @Override
    public int size() {
        lock.lock();
        try {
            return queue.size();
        } finally {
            lock.unlock();
        }
    }

    @Override
    public int capacity() {
        return capcity;
    }
}
