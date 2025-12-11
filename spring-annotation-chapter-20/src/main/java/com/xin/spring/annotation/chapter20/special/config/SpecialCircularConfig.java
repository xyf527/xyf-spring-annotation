package com.xin.spring.annotation.chapter20.special.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author XYF
 * @date 2025-12-11 15:53
 */

@Configuration
@ComponentScan(value = {"com.xin.spring.annotation.chapter20.special"})
public class SpecialCircularConfig {
}
