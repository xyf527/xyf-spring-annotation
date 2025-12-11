package com.xin.spring.annotation.chapter20.singleton;

import com.xin.spring.annotation.chapter20.singleton.bean.SingletonCircularBeanA;
import com.xin.spring.annotation.chapter20.singleton.config.SingletonCircularConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author XYF
 * @date 2025-12-11 17:24
 */

public class SingletonCircularTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SingletonCircularConfig.class);
        SingletonCircularBeanA singletonCircularBeanA = context.getBean(SingletonCircularBeanA.class);
        System.out.println("singletonCircularBeanA===>>>" + singletonCircularBeanA);
        System.out.println("singletonCircularBeanB===>>>" + singletonCircularBeanA.getSingletonCircularBeanB());
        context.close();
    }

}
