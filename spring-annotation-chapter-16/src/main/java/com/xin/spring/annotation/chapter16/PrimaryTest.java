package com.xin.spring.annotation.chapter16;

import com.xin.spring.annotation.chapter16.config.PrimaryConfig;
import com.xin.spring.annotation.chapter16.dao.PrimaryDao;
import com.xin.spring.annotation.chapter16.service.PrimaryService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author XYF
 * @date 2025-12-06 22:05
 */

public class PrimaryTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PrimaryConfig.class);
        PrimaryService primaryService = context.getBean(PrimaryService.class);
        System.out.println(primaryService);

    }

}
