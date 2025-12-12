package com.xin.spring.annotation.chapter21.sync.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author XYF
 * @date 2025-12-12 12:08
 */

@Configuration
@ComponentScan(value = {"com.xin.spring.annotation.chapter21.sync"})
public class SyncEventListenerConfig {
}
