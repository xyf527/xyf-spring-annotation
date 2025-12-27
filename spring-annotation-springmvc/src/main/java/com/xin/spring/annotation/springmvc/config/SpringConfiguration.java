package com.xin.spring.annotation.springmvc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

/**
 * @author XYF
 * @date 2025-12-27 13:46
 */

@Configuration
@ComponentScan(value = "com.xin.spring.annotation", excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Controller.class))
public class SpringConfiguration {
}
