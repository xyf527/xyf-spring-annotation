package com.xin.spring.annotation.chapter20.singleton.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author XYF
 * @date 2025-12-11 17:24
 */

@Configuration
@ComponentScan(value = {"com.xin.spring.annotation.chapter20.singleton"})
public class SingletonCircularConfig {
}
