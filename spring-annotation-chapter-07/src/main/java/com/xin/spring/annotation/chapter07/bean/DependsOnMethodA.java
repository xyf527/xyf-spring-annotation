package com.xin.spring.annotation.chapter07.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author XYF
 * @date 2025-11-27 17:15
 * @description TODO
 */

public class DependsOnMethodA {

    private final Logger logger = LoggerFactory.getLogger(DependsOnMethodA.class);

    public DependsOnMethodA(){
        logger.info("执行DependsOnMethodA的构造方法");
    }

}
