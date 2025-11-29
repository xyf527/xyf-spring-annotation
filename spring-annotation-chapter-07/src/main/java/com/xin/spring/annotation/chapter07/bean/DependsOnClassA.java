package com.xin.spring.annotation.chapter07.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

/**
 * @author XYF
 * @date 2025-11-27 17:06
 * @description TODO
 */

@Component
@DependsOn(value = {"dependsOnClassB"})
public class DependsOnClassA {

    private final Logger logger = LoggerFactory.getLogger(DependsOnClassA.class);

    public DependsOnClassA(){
        logger.info("执行DependsOnClassA的构造方法");
    }

}
