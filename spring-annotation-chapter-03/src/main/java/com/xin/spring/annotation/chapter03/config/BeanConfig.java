package com.xin.spring.annotation.chapter03.config;

import com.xin.spring.annotation.chapter03.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author XYF
 * @date 2025-11-22 14:10
 * @description TODO
 */

@Configuration
@ComponentScan(basePackages = "com.xin.spring.annotation.chapter03")
public class BeanConfig {

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public User user(){
        return new User();
    }

}
