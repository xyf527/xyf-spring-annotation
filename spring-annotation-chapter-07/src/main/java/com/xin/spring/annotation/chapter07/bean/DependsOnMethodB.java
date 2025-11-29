package com.xin.spring.annotation.chapter07.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author XYF
 * @date 2025-11-27 17:16
 * @description TODO
 */

public class DependsOnMethodB {

    private final Logger logger = LoggerFactory.getLogger(DependsOnMethodB.class);

    public DependsOnMethodB(){
        logger.info("执行DependsOnMethodB的构造方法");
    }

}
