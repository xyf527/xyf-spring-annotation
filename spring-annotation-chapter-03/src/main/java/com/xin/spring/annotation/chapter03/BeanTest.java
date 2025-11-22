package com.xin.spring.annotation.chapter03;

import com.xin.spring.annotation.chapter03.bean.User;
import com.xin.spring.annotation.chapter03.config.BeanConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author XYF
 * @date 2025-11-22 14:12
 * @description TODO
 */

public class BeanTest {

    private static final Logger logger = LoggerFactory.getLogger(BeanTest.class);

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
        logger.info("IOC容器启动完成...");
        User user1 = context.getBean(User.class);
        User user2 = context.getBean(User.class);
        logger.info("user1: {}", user1);
        logger.info("user2: {}", user2);
        logger.info("user1是否等于user2===>>>{}", user1 == user2);
        context.close();
    }

}
