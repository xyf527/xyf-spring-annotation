package com.xin.spring.annotation.chapter29;

import com.xin.spring.annotation.chapter29.bean.User;
import com.xin.spring.annotation.chapter29.config.TransactionConfig;
import com.xin.spring.annotation.chapter29.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.annotation.Annotation;

/**
 * @author XYF
 * @date 2025-12-18 17:19
 */

public class TransactionTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TransactionConfig.class);
        UserService userService = context.getBean(UserService.class);
        try{
            System.out.println("保存数据开始...");
            userService.saveUser(new User("xin"));
        }finally {
            System.out.println("保存数据结束...");
            context.close();
        }
    }

}
