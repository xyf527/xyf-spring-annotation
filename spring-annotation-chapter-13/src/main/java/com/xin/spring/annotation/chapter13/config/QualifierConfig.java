package com.xin.spring.annotation.chapter13.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author XYF
 * @date 2025-12-05 16:22
 * @description TODO
 */

@Configuration
@ComponentScan(value = {"com.xin.spring.annotation.chapter13"})
public class QualifierConfig {
}
