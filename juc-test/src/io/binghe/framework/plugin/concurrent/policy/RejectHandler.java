package io.binghe.framework.plugin.concurrent.policy;

import io.binghe.framework.plugin.concurrent.executor.ThreadPoolExecutor;

/**
 * @author binghe(微信 : hacker_binghe)
 * @version 1.0.0
 * @description 拒绝策略接口
 * @github https://github.com/binghe001
 * @copyright 公众号: 冰河技术
 */
public interface RejectHandler {

    /**
     * 拒绝任务回调接口
     */
    void reject(Runnable r, ThreadPoolExecutor executor);
}
