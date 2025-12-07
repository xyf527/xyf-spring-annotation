package com.xin.concurrent;

import com.xin.concurrent.executor.ThreadPoolExecutor;
import com.xin.concurrent.queue.ConcurrentBlockingQueue;

import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

/**
 * @author XYF
 * @date 2025-12-07 12:31
 */

public class ThreadPoolExecutorTest {

    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(3, 10, 5, TimeUnit.SECONDS, new ConcurrentBlockingQueue<>(8), new ThreadPoolExecutor.CallerRunsPolicy());
        IntStream.rangeClosed(1, 10).forEach((i) -> {
            executor.execute(() -> {
                System.out.println(Thread.currentThread().getName() + "===>>>正在执行任务");
            });
        });
        executor.shutdown();
    }

}
