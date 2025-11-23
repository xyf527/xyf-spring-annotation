package com.xin.spring.annotation.chapter04;

import com.xin.spring.annotation.chapter04.config.BeanConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author XYF
 * @date 2025-11-23 14:14
 * @description TODO
 */

public class BeanTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
        context.close();
    }

}
