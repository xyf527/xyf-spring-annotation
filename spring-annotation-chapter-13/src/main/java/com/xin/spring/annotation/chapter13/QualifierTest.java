package com.xin.spring.annotation.chapter13;

import com.xin.spring.annotation.chapter13.config.QualifierConfig;
import com.xin.spring.annotation.chapter13.service.QualifierService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author XYF
 * @date 2025-12-05 16:23
 * @description TODO
 */

public class QualifierTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(QualifierConfig.class);
        QualifierService qualifierService = context.getBean(QualifierService.class);
        System.out.println("qualifierService===>>>" + qualifierService);
    }

}
