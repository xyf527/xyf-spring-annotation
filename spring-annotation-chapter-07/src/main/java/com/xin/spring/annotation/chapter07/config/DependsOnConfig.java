package com.xin.spring.annotation.chapter07.config;

import com.xin.spring.annotation.chapter07.bean.DependsOnMethodA;
import com.xin.spring.annotation.chapter07.bean.DependsOnMethodB;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

/**
 * @author XYF
 * @date 2025-11-27 17:12
 * @description TODO
 */

@Configuration
@ComponentScan(basePackages = "com.xin.spring.annotation.chapter07")
public class DependsOnConfig {

    @DependsOn(value = "dependsOnMethodB")
    @Bean(value = "dependsOnMethodA")
    public DependsOnMethodA dependsOnMethodA(){
        return new DependsOnMethodA();
    }

    @Bean(value = "dependsOnMethodB")
    public DependsOnMethodB dependsOnMethodB(){
        return new DependsOnMethodB();
    }

}
