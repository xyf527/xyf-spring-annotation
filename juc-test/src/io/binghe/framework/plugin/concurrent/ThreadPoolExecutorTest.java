package io.binghe.framework.plugin.concurrent;

import io.binghe.framework.plugin.concurrent.executor.ThreadPoolExecutor;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * @author binghe(微信 : hacker_binghe)
 * @version 1.0.0
 * @description 测试类
 * @github https://github.com/binghe001
 * @copyright 公众号: 冰河技术
 */
public class ThreadPoolExecutorTest {

    public static void main(String[] args){
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(10, 10, 30, TimeUnit.SECONDS, new ArrayBlockingQueue<>(100));
        for (int i = 0; i < 10; i++) {
            threadPoolExecutor.execute(() -> {
                System.out.println(Thread.currentThread().getName() + " 执行任务");
            });
        }
        threadPoolExecutor.shutdown();
    }
}
