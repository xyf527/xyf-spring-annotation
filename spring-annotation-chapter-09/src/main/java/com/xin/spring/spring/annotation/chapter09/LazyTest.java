package com.xin.spring.spring.annotation.chapter09;

import com.xin.spring.spring.annotation.chapter09.bean.LazyBean;
import com.xin.spring.spring.annotation.chapter09.config.LazyConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.annotation.Annotation;

/**
 * @author XYF
 * @date 2025-12-01 21:54
 * @description TODO
 */

public class LazyTest {

    public static void main(String[] args) {
        System.out.println("创建IOC容器开始...");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(LazyConfig.class);
        System.out.println("创建IOC容器结束...");
        System.out.println("从IOC中获取Bean开始...");
        // 在第一次获取Bean对象时才会创建
        LazyBean lazyBean1 = context.getBean(LazyBean.class);
        LazyBean lazyBean2 = context.getBean(LazyBean.class);
        System.out.println("(lazyBean1是否等于lazyBean2)===>>>" + (lazyBean1 == lazyBean2));
        System.out.println("从IOC容器中获取Bean结束...");

    }

}
