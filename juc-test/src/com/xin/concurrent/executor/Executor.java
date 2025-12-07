package com.xin.concurrent.executor;

/**
 * @author XYF
 * @date 2025-12-07 12:00
 */

public interface Executor {

    // 执行任务
    void execute(Runnable task);

    // 关闭线程池
    void shutdown();

}
