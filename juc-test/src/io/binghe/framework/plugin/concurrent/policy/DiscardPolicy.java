package io.binghe.framework.plugin.concurrent.policy;

import io.binghe.framework.plugin.concurrent.executor.ThreadPoolExecutor;

/**
 * @author binghe(微信 : hacker_binghe)
 * @version 1.0.0
 * @description 仿照JDK线程池忽略任务执行
 * @github https://github.com/binghe001
 * @copyright 公众号: 冰河技术
 */
public class DiscardPolicy  implements RejectHandler {
    public DiscardPolicy() { }

    @Override
    public void reject(Runnable r, ThreadPoolExecutor e) {
    }
}
