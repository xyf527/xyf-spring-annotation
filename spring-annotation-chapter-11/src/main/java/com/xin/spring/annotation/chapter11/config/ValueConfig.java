package com.xin.spring.annotation.chapter11.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author XYF
 * @date 2025-12-03 16:04
 * @description TODO
 */

@Configuration
@ComponentScan(value = {"com.xin.spring.annotation.chapter11"})
@PropertySource(value = {"classpath:test.properties"})
public class ValueConfig {

    // 注入普通字符串
    @Value("normalString")
    private String normalString;

    // 注入操作系统名称
    @Value("#{systemProperties['os.name']}")
    private String osName;

    // 注入表达式的结果
    @Value("#{ T(java.lang.Math).random() * 100.0}")
    private double randomNum;

    // 注入其他Bean的属性
    @Value("#{valueName.name}")
    private String name;

    @Value("${db.url}")
    private String url;

    @Override
    public String toString() {
        return "ValueConfig{" +
                "normalString='" + normalString + '\'' +
                ", osName='" + osName + '\'' +
                ", randomNum=" + randomNum +
                ", name='" + name + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
