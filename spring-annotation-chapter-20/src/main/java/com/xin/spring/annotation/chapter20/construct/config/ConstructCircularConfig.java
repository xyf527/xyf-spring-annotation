package com.xin.spring.annotation.chapter20.construct.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author XYF
 * @date 2025-12-11 17:04
 */

@Configuration
@ComponentScan(value = {"com.xin.spring.annotation.chapter20.construct"})
public class ConstructCircularConfig {
}
