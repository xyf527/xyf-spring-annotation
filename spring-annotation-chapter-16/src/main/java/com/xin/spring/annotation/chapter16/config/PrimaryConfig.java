package com.xin.spring.annotation.chapter16.config;

import com.xin.spring.annotation.chapter16.dao.PrimaryDao;
import com.xin.spring.annotation.chapter16.dao.impl.PrimaryDao1;
import com.xin.spring.annotation.chapter16.dao.impl.PrimaryDao2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * @author XYF
 * @date 2025-12-06 22:04
 */

@ComponentScan(value = {"com.xin.spring.annotation.chapter16"})
@Configuration
public class PrimaryConfig {

    @Bean
    public PrimaryDao primaryDao1() {
        return new PrimaryDao1();
    }

    @Bean
    @Primary
    public PrimaryDao primaryDao2() {
        return new PrimaryDao2();
    }

}
