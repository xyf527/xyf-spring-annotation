package com.xin.spring.annotation.chapter17;

import com.xin.spring.annotation.chapter17.bean.ScopeBean;
import com.xin.spring.annotation.chapter17.config.ScopeConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author XYF
 * @date 2025-12-07 21:09
 */

public class ScopeTest {

    public static void main(String[] args) {
        System.out.println("创建IOC容器开始...");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScopeConfig.class);
        System.out.println("创建IOC容器结束...");
        System.out.println("从IOC容器第一次获取Bean对象开始...");
        ScopeBean scopeBean = context.getBean(ScopeBean.class);
        System.out.println(scopeBean);
        System.out.println("从IOC容器第一次获取Bean对象结束...");

        System.out.println("从IOC容器第二次获取Bean对象开始...");
        scopeBean = context.getBean(ScopeBean.class);
        System.out.println(scopeBean);
        System.out.println("从IOC容器第二次获取Bean对象结束...");
    }

}
