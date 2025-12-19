package com.xin.spring.annotation.chapter28;

import com.xin.spring.annotation.chapter28.config.EnableLoadTimeWeavingConfig;
import com.xin.spring.annotation.chapter28.service.EnableLoadTimeWeavingService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author XYF
 * @date 2025-12-17 19:33
 */

public class EnableLoadTimeWeavingTest {

    public static void main(String[] args) {
        // System.out.println("AspectJ Weaver 状态: " + org.aspectj.weaver.loadtime.Agent.getInstrumentation());
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EnableLoadTimeWeavingConfig.class);
        EnableLoadTimeWeavingService enableLoadTimeWeavingService = context.getBean(EnableLoadTimeWeavingService.class);
        System.out.println("Service Class: " + enableLoadTimeWeavingService.getClass().getName());
        enableLoadTimeWeavingService.printEnableLoadTimeWeaving();
        context.close();
    }

}
