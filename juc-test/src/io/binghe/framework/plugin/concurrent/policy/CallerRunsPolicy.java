package io.binghe.framework.plugin.concurrent.policy;

import io.binghe.framework.plugin.concurrent.executor.ThreadPoolExecutor;

/**
 * @author binghe(微信 : hacker_binghe)
 * @version 1.0.0
 * @description 仿照JDK线程池使用提交线程执行任务
 * @github https://github.com/binghe001
 * @copyright 公众号: 冰河技术
 */
public class CallerRunsPolicy implements RejectHandler {

    public CallerRunsPolicy() { }

    @Override
    public void reject(Runnable r, ThreadPoolExecutor e) {
        if (!e.isShutdown()) {
            r.run();
        }
    }
}
