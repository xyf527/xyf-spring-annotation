package com.xin.spring.chapter06;

import com.xin.spring.chapter06.config.PropertySourceConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * @author XYF
 * @date 2025-11-26 15:49
 * @description TODO
 */

public class PropertySourceTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PropertySourceConfig.class);
        ConfigurableEnvironment environment = context.getEnvironment();
        System.out.println(environment.getProperty("name") + "===>>>" + environment.getProperty("age"));
    }

}

