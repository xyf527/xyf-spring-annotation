package com.xin.spring.annotation.chapter19.config;

import com.xin.spring.annotation.chapter19.bean.ProfileBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @author XYF
 * @date 2025-12-10 19:27
 */

// 当@Profile标注到类上 虽然方法上也标注了注解 但是整体会以类上所选环境的注解为准
// @Profile("prod")
@Profile("default")
@Configuration
public class ProfileConfig {

    @Profile("default")
    @Bean("profileBeanDefault")
    public ProfileBean profileBeanDefault() {
        return new ProfileBean("默认环境");
    }

    @Profile("dev")
    @Bean("profileBeanDev")
    public ProfileBean profileBeanDev() {
        return new ProfileBean("开发环境");
    }

    @Profile("test")
    @Bean("profileBeanTest")
    public ProfileBean profileBeanTest() {
        return new ProfileBean("测试环境");
    }

    @Profile("prod")
    @Bean("profileBeanProd")
    public ProfileBean profileBeanProd() {
        return new ProfileBean("生产环境");
    }

}
