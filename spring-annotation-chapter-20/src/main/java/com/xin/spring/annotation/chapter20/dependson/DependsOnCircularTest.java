package com.xin.spring.annotation.chapter20.dependson;

import com.xin.spring.annotation.chapter20.dependson.bean.DependsOnCircularBeanA;
import com.xin.spring.annotation.chapter20.dependson.config.DependsOnCircularConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author XYF
 * @date 2025-12-11 17:20
 */

public class DependsOnCircularTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DependsOnCircularConfig.class);
        DependsOnCircularBeanA dependsOnCircularBeanA = context.getBean(DependsOnCircularBeanA.class);
        System.out.println("dependsOnCircularBeanA===>>>" + dependsOnCircularBeanA);
        System.out.println("dependsOnCircularBeanB===>>>" + dependsOnCircularBeanA.getDependsOnCircularBeanB());
        context.close();
    }

}
