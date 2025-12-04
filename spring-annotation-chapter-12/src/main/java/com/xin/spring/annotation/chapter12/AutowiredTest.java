package com.xin.spring.annotation.chapter12;

import com.xin.spring.annotation.chapter12.config.AutowiredConfig;
import com.xin.spring.annotation.chapter12.dao.AutowiredDao;
import com.xin.spring.annotation.chapter12.service.AutowiredService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.annotation.Annotation;

/**
 * @author XYF
 * @date 2025-12-04 16:12
 * @description TODO
 */

public class AutowiredTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AutowiredConfig.class);
        AutowiredDao autowiredDao = context.getBean(AutowiredDao.class);
        System.out.println("autowiredDao===>>>" + autowiredDao);
        AutowiredService autowiredService = context.getBean(AutowiredService.class);
        System.out.println("autowiredService===>>>" + autowiredService);
    }

}
