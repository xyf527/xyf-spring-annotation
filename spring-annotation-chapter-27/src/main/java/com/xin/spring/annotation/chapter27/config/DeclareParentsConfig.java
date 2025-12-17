package com.xin.spring.annotation.chapter27.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author XYF
 * @date 2025-12-17 15:43
 */

@Configuration
@ComponentScan(value = {"com.xin.spring.annotation.chapter27"})
@EnableAspectJAutoProxy
public class DeclareParentsConfig {
}
