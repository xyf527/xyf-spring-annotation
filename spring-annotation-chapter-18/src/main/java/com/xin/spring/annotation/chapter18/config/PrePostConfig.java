package com.xin.spring.annotation.chapter18.config;

import com.xin.spring.annotation.chapter18.bean.PrePostBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author XYF
 * @date 2025-12-09 09:15
 */

@Configuration
public class PrePostConfig {

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public PrePostBean prePostBean(){
        return new PrePostBean();
    }

}
