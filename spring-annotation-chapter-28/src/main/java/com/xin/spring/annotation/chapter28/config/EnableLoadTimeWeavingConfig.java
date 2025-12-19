package com.xin.spring.annotation.chapter28.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableLoadTimeWeaving;

/**
 * @author XYF
 * @date 2025-12-17 19:31
 */

@Configuration
@EnableLoadTimeWeaving(aspectjWeaving = EnableLoadTimeWeaving.AspectJWeaving.AUTODETECT)
@ComponentScan(value = {"com.xin.spring.annotation.chapter28"})
public class EnableLoadTimeWeavingConfig {
}
