package com.xin.spring.annotation.chapter07.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * @author XYF
 * @date 2025-11-27 17:10
 * @description TODO
 */

@Component(value = "dependsOnClassB")
public class DependsOnClassB {

    private final Logger logger = LoggerFactory.getLogger(DependsOnClassB.class);

    public DependsOnClassB(){
        logger.info("执行DependsOnClassB的构造方法");
    }

}
