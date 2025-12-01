package com.xin.spring.spring.annotation.chapter09.config;

import com.xin.spring.spring.annotation.chapter09.bean.LazyBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

/**
 * @author XYF
 * @date 2025-12-01 21:54
 * @description TODO
 */

// 当标注@Lazy后 当IOC容器启东时并不会创建单例Bean
@Lazy
@Configuration
public class LazyConfig {

    @Bean
    public LazyBean lazyBean() {
        return new LazyBean();
    }

}
