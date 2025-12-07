package io.binghe.framework.plugin.concurrent.queue;

import java.util.concurrent.TimeUnit;

/**
 * @author binghe(微信 : hacker_binghe)
 * @version 1.0.0
 * @description 队列接口
 * @github https://github.com/binghe001
 * @copyright 公众号: 冰河技术
 */
public interface ConcurrentQueue<T> {

    /**
     * 超时获取并移除队列数据
     */
    T poll(long timeout, TimeUnit timeUnit);

    /**
     * 阻塞获取并移除队列数据
     */
    T take();

    /**
     * 向队列中添加元素
     */
    void put(T task);


    /**
     * 向队列中超时添加元素
     */
    boolean offer(T task, long timeout, TimeUnit timeUnit);

    /**
     * 返回队列中元素的个数
     */
    int size();

    /**
     * 对列容量
     */
    int capcity();
}
