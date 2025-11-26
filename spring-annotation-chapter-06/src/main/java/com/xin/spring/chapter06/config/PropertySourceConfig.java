package com.xin.spring.chapter06.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author XYF
 * @date 2025-11-26 15:47
 * @description TODO
 */
@Configuration
@PropertySource(value = "classpath:test.properties")
public class PropertySourceConfig {
}
