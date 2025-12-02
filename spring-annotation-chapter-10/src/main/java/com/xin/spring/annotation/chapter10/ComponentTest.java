package com.xin.spring.annotation.chapter10;

import com.xin.spring.annotation.chapter10.config.ComponentConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

/**
 * @author XYF
 * @date 2025-12-02 16:42
 * @description TODO
 */

public class ComponentTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ComponentConfig.class);
        String[] definitionNames = context.getBeanDefinitionNames();
        Arrays.stream(definitionNames).forEach(definitionName -> System.out.println(definitionName));
    }

}
