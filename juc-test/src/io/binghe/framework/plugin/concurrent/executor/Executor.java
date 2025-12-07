package io.binghe.framework.plugin.concurrent.executor;

/**
 * @author binghe(微信 : hacker_binghe)
 * @version 1.0.0
 * @description 测试类
 * @github https://github.com/binghe001
 * @copyright 公众号: 冰河技术
 */
public interface Executor {
    /**
     * 执行任务
     */
    void execute(Runnable task);

    /**
     * 关闭线程池
     */
    void shutdown();
}
