package com.xin.spring.annotation.chapter04.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

/**
 * @author XYF
 * @date 2025-11-23 14:13
 * @description TODO
 */

@Configuration
@ComponentScan(basePackages = "com.xin.spring.annotation.chapter04")
public class BeanConfig {
}
