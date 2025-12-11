package com.xin.spring.annotation.chapter20.dependson.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author XYF
 * @date 2025-12-11 17:20
 */

@Configuration
@ComponentScan(value = {"com.xin.spring.annotation.chapter20.dependson"})
public class DependsOnCircularConfig {
}
