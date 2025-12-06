package com.xin.spring.annotation.chapter15.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author XYF
 * @date 2025-12-06 21:54
 */

@Configuration
@ComponentScan(value = {"com.xin.spring.annotation.chapter15"})
public class InjectConfig {
}
