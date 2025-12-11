package com.xin.spring.annotation.chapter20.proxy.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @author XYF
 * @date 2025-12-11 16:56
 */

@Configuration
@EnableAsync
@ComponentScan(value = {"com.xin.spring.annotation.chapter20.proxy"})
public class ProxyCircularConfig {
}
