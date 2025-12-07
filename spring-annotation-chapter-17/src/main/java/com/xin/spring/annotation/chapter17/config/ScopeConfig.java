package com.xin.spring.annotation.chapter17.config;

import com.xin.spring.annotation.chapter17.bean.ScopeBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @author XYF
 * @date 2025-12-07 21:07
 */

@Configuration
public class ScopeConfig {

    @Bean
    @Scope(value = "singleton") // 单例Bean IOC容器启动时默认会创建Bean对象 可用@Lazy使用时才创建
    // @Scope(value = "prototype") // 原型Bean IOC容器启动时默认不会创建Bean对象 每次从IOC容器中获取Bean对象都会创建一个新的Bean对象
    public ScopeBean scopeBean() {
        return new ScopeBean();
    }

}
