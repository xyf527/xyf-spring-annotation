package com.xin.spring.annotation.chapter05;

import com.xin.spring.annotation.chapter05.config.ImportConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

/**
 * @author XYF
 * @date 2025-11-24 16:12
 * @description TODO
 */

public class ImportTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ImportConfig.class);
        String[] definitionNames = context.getBeanDefinitionNames();
        Arrays.stream(definitionNames).forEach((definitionName) -> {
            System.out.println(definitionName);
        });
    }

}
