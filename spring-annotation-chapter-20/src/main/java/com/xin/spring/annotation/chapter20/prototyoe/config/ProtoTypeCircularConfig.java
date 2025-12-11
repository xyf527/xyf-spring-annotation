package com.xin.spring.annotation.chapter20.prototyoe.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @author XYF
 * @date 2025-12-11 15:59
 */

@Configuration
@ComponentScan(value = {"com.xin.spring.annotation.chapter20.prototyoe"})
public class ProtoTypeCircularConfig {
}
