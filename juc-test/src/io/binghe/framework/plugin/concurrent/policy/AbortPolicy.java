package io.binghe.framework.plugin.concurrent.policy;

import io.binghe.framework.plugin.concurrent.exception.RejectedExecutionException;
import io.binghe.framework.plugin.concurrent.executor.ThreadPoolExecutor;

/**
 * @author binghe(微信 : hacker_binghe)
 * @version 1.0.0
 * @description 仿照JDK线程池直接抛出异常
 * @github https://github.com/binghe001
 * @copyright 公众号: 冰河技术
 */
public class AbortPolicy implements RejectHandler {

    public AbortPolicy() { }

    @Override
    public void reject(Runnable r, ThreadPoolExecutor e) {
        throw new RejectedExecutionException("Task " + r.toString() + " rejected from " +
                e.toString());
    }
}
