package com.xin.spring.annotation.chapter03.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author XYF
 * @date 2025-11-22 14:08
 * @description TODO
 */

public class User {

    private final Logger logger = LoggerFactory.getLogger(User.class);

    public User(){
        logger.info("执行构造方法...");
    }

    public void init(){
        logger.info("执行初始化方法...");
    }

    public void destroy(){
        logger.info("执行销毁方法...");
    }

}
