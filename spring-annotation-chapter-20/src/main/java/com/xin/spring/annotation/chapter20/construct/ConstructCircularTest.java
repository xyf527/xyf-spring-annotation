package com.xin.spring.annotation.chapter20.construct;

import com.xin.spring.annotation.chapter20.construct.bean.ConstructCircularBeanA;
import com.xin.spring.annotation.chapter20.construct.config.ConstructCircularConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author XYF
 * @date 2025-12-11 17:04
 */

public class ConstructCircularTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConstructCircularConfig.class);
        ConstructCircularBeanA constructCircularBeanA = context.getBean(ConstructCircularBeanA.class);
        System.out.println("constructCircularBeanA===>>>" + constructCircularBeanA);
        System.out.println("constructCircularBeanB===>>>" + constructCircularBeanA.getConstructCircularBeanB());
        context.close();
    }

}
