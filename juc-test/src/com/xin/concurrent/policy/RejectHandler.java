package com.xin.concurrent.policy;

import com.xin.concurrent.executor.ThreadPoolExecutor;

/**
 * @author XYF
 * @date 2025-12-07 11:59
 */

public interface RejectHandler {

    // 拒绝任务回调接口
    void reject(Runnable r, ThreadPoolExecutor executor);

}
