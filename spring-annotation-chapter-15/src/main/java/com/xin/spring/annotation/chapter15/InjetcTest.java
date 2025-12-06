package com.xin.spring.annotation.chapter15;

import com.xin.spring.annotation.chapter15.config.InjectConfig;
import com.xin.spring.annotation.chapter15.service.InjectService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author XYF
 * @date 2025-12-06 21:55
 */


public class InjetcTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(InjectConfig.class);
        InjectService injectService = context.getBean(InjectService.class);
        System.out.println(injectService);
    }

}
