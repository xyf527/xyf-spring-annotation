package com.xin.spring.annotation.chapter02.componentscan;

import com.xin.spring.annotation.chapter02.componentscan.config.ComponentScanConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

/**
 * @author XYF
 * @date 2025-11-21 22:03
 * @description @ComponentScan测试类
 */

public class ComponentScanTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ComponentScanConfig.class);
        String[] names = context.getBeanDefinitionNames();
        Arrays.stream(names).forEach(System.out :: println);
    }

}
