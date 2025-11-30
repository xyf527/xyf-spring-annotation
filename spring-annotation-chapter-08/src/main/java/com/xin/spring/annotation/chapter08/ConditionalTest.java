package com.xin.spring.annotation.chapter08;

import com.xin.spring.annotation.chapter08.config.ConditionalConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

/**
 * @author XYF
 * @date 2025-11-30 09:34
 * @description TODO
 */

public class ConditionalTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConditionalConfig.class);
        String[] definitionNames = context.getBeanDefinitionNames();
        Arrays.stream(definitionNames).forEach((definitionName) -> System.out.println(definitionName));

    }

}
