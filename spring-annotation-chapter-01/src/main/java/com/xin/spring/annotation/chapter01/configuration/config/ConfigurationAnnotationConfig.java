package com.xin.spring.annotation.chapter01.configuration.config;

import com.xin.spring.annotation.chapter01.configuration.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author XYF
 * @date 2025-11-20 20:40
 * @description 模拟的@ConfigurationAnnotation配置类
 */

@Configuration
public class ConfigurationAnnotationConfig {

    @Bean
    public Person person(){
        return new Person();
    }

}
