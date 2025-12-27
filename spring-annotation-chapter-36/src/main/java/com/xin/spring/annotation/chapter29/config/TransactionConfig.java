package com.xin.spring.annotation.chapter29.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.*;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.TransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author XYF
 * @date 2025-12-18 17:16
 */

@Configuration
@ComponentScan(value = {"com.xin.spring.annotation.chapter29"})
@PropertySource(value = {"classpath:druid.properties"})
@Import({JdbcConfig.class, MyBatisConfig.class})
@EnableTransactionManagement
public class TransactionConfig {

    @Bean
    public TransactionManager transactionManager(DruidDataSource dataSource){
        return new DataSourceTransactionManager(dataSource);
    }
}
