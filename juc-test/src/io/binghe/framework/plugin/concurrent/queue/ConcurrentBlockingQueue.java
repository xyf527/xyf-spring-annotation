package io.binghe.framework.plugin.concurrent.queue;

import io.binghe.framework.plugin.concurrent.exception.ConcurrentException;
import io.binghe.framework.plugin.concurrent.policy.RejectHandler;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author binghe(微信 : hacker_binghe)
 * @version 1.0.0
 * @description 自定义队列
 * @github https://github.com/binghe001
 * @copyright 公众号: 冰河技术
 */
public class ConcurrentBlockingQueue<T> implements ConcurrentQueue<T> {

    //ArrayBlockingQueue 队列
    private final BlockingQueue<T> queue;

    //ReentrantLock锁
    private final ReentrantLock lock = new ReentrantLock();

    //消费者可以消费
    private final Condition notEmpty = lock.newCondition();

    //生产者可以生产
    private final Condition notFull = lock.newCondition();

    //队列容量
    private final int capcity;

    //拒绝策略
    private RejectHandler rejectHandler;

    public ConcurrentBlockingQueue(int capcity){
        if (capcity <= 0){
            throw new IllegalArgumentException();
        }
        this.capcity = capcity;
        this.queue = new ArrayBlockingQueue<T>(capcity);
    }

    @Override
    public T poll(long timeout, TimeUnit timeUnit) {
        lock.lock();
        try{
            //转化为纳秒
            long nanos = timeUnit.toNanos(timeout);
            //是否为空
            while (queue.isEmpty()){
                if (nanos <= 0){
                    return null;
                }
                nanos = notEmpty.awaitNanos(nanos);
            }
            T t = queue.remove();
            notFull.signal();
            return t;
        }catch (Exception e){
            throw new ConcurrentException(e);
        } finally {
            lock.unlock();
        }
    }

    @Override
    public T take() {
        lock.lock();
        try{
            while (queue.isEmpty()){
                notEmpty.await();
            }
            T t = queue.remove();
            notFull.signal();
            return t;
        }catch (Exception e){
            throw new ConcurrentException(e);
        }finally {
            lock.unlock();
        }
    }

    @Override
    public void put(T task) {
        lock.lock();
        try{
            while (queue.size() == capcity){
                notFull.await();
            }
            queue.add(task);
            notEmpty.signal();
        }catch (Exception e){
            throw new ConcurrentException(e);
        }finally {
            lock.unlock();
        }

    }

    @Override
    public boolean offer(T task, long timeout, TimeUnit timeUnit) {
        lock.lock();
        try{
            long nanos = timeUnit.toNanos(timeout);
            while (queue.size() == capcity){
                if (nanos <= 0){
                    return false;
                }
                nanos = notFull.awaitNanos(nanos);
            }
            queue.add(task);
            notEmpty.signal();
            return true;
        }catch (Exception e){
            throw new ConcurrentException(e);
        }finally {
            lock.unlock();
        }
    }

    @Override
    public int size() {
        lock.lock();
        try{
            return queue.size();
        }finally {
            lock.unlock();
        }
    }

    @Override
    public int capcity() {
        return capcity;
    }
}
