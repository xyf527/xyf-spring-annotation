package com.xin.spring.annotation.chapter21.async.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author XYF
 * @date 2025-12-12 12:16
 */

@Configuration
public class ThreadPoolConfig {

    @Bean("xinExecutor")
    public Executor taskExecutor() {
        ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
        // 设置线程池参数信息
        taskExecutor.setCorePoolSize(8);
        taskExecutor.setMaxPoolSize(20);
        taskExecutor.setQueueCapacity(50);
        taskExecutor.setKeepAliveSeconds(60);
        taskExecutor.setThreadGroupName("xin-executor--");
        taskExecutor.setWaitForTasksToCompleteOnShutdown(true);
        // 设置线程池中任务的等待时间 如果超过这个时候还没有销毁就强制销毁 以确保应用最后能被关闭而不是阻塞住
        taskExecutor.setAwaitTerminationSeconds(60);
        // 修改拒绝策略为使用当前线程执行
        taskExecutor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
        // 初始化线程组
        taskExecutor.initialize();
        return taskExecutor;
    }

}
