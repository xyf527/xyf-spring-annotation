package com.xin.spring.annotation.chapter29.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

/**
 * @author XYF
 * @date 2025-12-18 17:14
 */

public class JdbcConfig {

    @Value("${druid.driver}")
    private String driver;

    @Value("${druid.url}")
    private String url;

    @Value("${druid.userName}")
    private String userName;

    @Value("${druid.password}")
    private String password;

    @Value("${druid.pool.init}")
    private int init;

    @Value("${druid.pool.minIdle}")
    private int minIdle;

    @Value("${druid.pool.maxActive}")
    private int maxActive;

    @Value("${durid.pool.timeout}")
    private int timeout;

    @Bean
    public DruidDataSource dataSource(){
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(driver);
        dataSource.setUrl(url);
        dataSource.setUsername(userName);
        dataSource.setPassword(password);
        dataSource.setInitialSize(init);
        dataSource.setMinIdle(minIdle);
        dataSource.setMaxIdle(maxActive);
        dataSource.setMaxWait(timeout);
        return dataSource;
    }
    
}
