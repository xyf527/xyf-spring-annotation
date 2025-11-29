package com.xin.spring.annotation.chapter07;

import com.xin.spring.annotation.chapter07.config.DependsOnConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author XYF
 * @date 2025-11-27 17:13
 * @description TODO
 */

public class DependsOnTest {

    public static void main(String[] args) {
        new AnnotationConfigApplicationContext(DependsOnConfig.class);
    }

}
