package com.xin.spring.annotation.chapter22.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author XYF
 * @date 2025-12-13 17:03
 */

@Configuration
@EnableAspectJAutoProxy
@ComponentScan({"com.xin.spring.annotation.chapter22"})
public class AspectConfig {

}
