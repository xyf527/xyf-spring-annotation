package com.xin.spring.annotation.chapter29.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;

/**
 * @author XYF
 * @date 2025-12-18 17:15
 */

public class MyBatisConfig {

    @Bean
    public SqlSessionFactoryBean sqlSessionFactory(DruidDataSource dataSource){
        SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
        sqlSessionFactory.setDataSource(dataSource);
        sqlSessionFactory.setTypeAliasesPackage("com.xin.spring.annotation.chapter29.dao");
        return sqlSessionFactory;
    }
    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer(){
        MapperScannerConfigurer msc = new MapperScannerConfigurer();
        msc.setBasePackage("com.xin.spring.annotation.chapter29.dao");
        return msc;
    }
    
    
}
