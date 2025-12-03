package com.xin.spring.annotation.chapter11;

import com.xin.spring.annotation.chapter11.config.ValueConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author XYF
 * @date 2025-12-03 16:09
 * @description TODO
 */

public class ValueTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ValueConfig.class);
        ValueConfig valueConfig = context.getBean(ValueConfig.class);
        System.out.println(valueConfig.toString());
    }

}
