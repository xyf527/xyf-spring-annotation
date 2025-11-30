package com.xin.spring.annotation.chapter08.config;

import com.xin.spring.annotation.chapter08.bean.Founder;
import com.xin.spring.annotation.chapter08.condition.MacosCondition;
import com.xin.spring.annotation.chapter08.condition.WindowsCondition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @author XYF
 * @date 2025-11-30 09:29
 * @description TODO
 */
/*
    当@Conditional注解标注到类上 如果运行程序时 不满足@Conditional注解中指定的条件
    则当前所有Bean都不会被创建 也不会注入到IOC容器中
    当@Conditional注解同时标注到类和方法上时 如果标注到类上的Conditional注解不满足条件
    即使类中的方法上标注的@Conditional注解满足条件 也不会创建Bean 并且也不会将Bean注入到IOC容器哦中
 */

@Conditional(value = {MacosCondition.class})
@Configuration
public class ConditionalConfig {

    @Conditional(value = {WindowsCondition.class})
    @Bean(name = "bill")
    public Founder windowfFounder(){
        System.out.println("创建名称bill的bean");
        return new Founder("Bill Gated");
    }

    @Conditional(value = {MacosCondition.class})
    @Bean(name = "jobs")
    public Founder macosFounder(){
        System.out.println("创建名称jobs的Bean");
        return new Founder("Steve Jobs");
    }

}
