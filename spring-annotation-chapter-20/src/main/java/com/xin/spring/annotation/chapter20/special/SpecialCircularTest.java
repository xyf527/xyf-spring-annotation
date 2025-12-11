package com.xin.spring.annotation.chapter20.special;

import com.xin.spring.annotation.chapter20.special.bean.SpecialCircularBeanA;
import com.xin.spring.annotation.chapter20.special.config.SpecialCircularConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author XYF
 * @date 2025-12-11 15:54
 */

public class SpecialCircularTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpecialCircularConfig.class);
        SpecialCircularBeanA specialCircularBeanA = context.getBean(SpecialCircularBeanA.class);
        System.out.println(specialCircularBeanA);
        context.close();
    }

}
