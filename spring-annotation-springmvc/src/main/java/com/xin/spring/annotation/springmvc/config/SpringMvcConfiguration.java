package com.xin.spring.annotation.springmvc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

/**
 * @author XYF
 * @date 2025-12-27 13:48
 */

@Configuration
@ComponentScan(value = "com.xin.spring.annotation", includeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, value = Controller.class)}, useDefaultFilters = false)
public class SpringMvcConfiguration {

}
