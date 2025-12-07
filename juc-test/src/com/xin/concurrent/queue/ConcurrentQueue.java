package com.xin.concurrent.queue;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

/**
 * @author XYF
 * @date 2025-12-07 11:40
 */

public interface ConcurrentQueue<T> {

    // 超时获取并移除队列数据
    T poll(long timeout, TimeUnit unit);

    // 阻塞获取并移除队列数据
    T take();

    // 向队列中添加元素
    void put(T task);

    // 向队列中添加元素
    boolean offer(T task, long timeout, TimeUnit unit);

    // 返回队列中元素的个数
    int size();

    //队列容量
    int capacity();

}
