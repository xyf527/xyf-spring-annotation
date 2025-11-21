package com.xin.spring.annotation.chapter01.configuration;

import com.xin.spring.annotation.chapter01.configuration.bean.Person;
import com.xin.spring.annotation.chapter01.configuration.config.ConfigurationAnnotationConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.annotation.Annotation;

/**
 * @author XYF
 * @date 2025-11-20 20:43
 * @description example
 */

public class ConfigurationAnnotationTest {

    private static final Logger logger = LoggerFactory.getLogger(ConfigurationAnnotationTest.class);

    public static void main(String[] args) {
        // 无 @Configuration
        // AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.xin.spring.annotation.chapter01.configuration.config");
        // Exception in thread "main" org.springframework.beans.factory.NoSuchBeanDefinitionException: No qualifying bean of type 'com.xin.spring.annotation.chapter01.configuration.config.ConfigurationAnnotationConfig' available
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationAnnotationConfig.class);
        // 获取ConfigurationAnnotationConfig类的Bean实例对象config
        ConfigurationAnnotationConfig config = context.getBean(ConfigurationAnnotationConfig.class);
        Person person1 = config.person();
        Person person2 = config.person();
        logger.info("person1: {}, person2: {}", person1, person2);
        // @Configuration的proxyBeanMethods()默认为true
        // 如果为false bean实例对象不会复用 重复创建
        logger.info("person1 == person2 ===>> {}", person1 == person2);
    }


}
