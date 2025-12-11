package com.xin.spring.annotation.chapter20.prototyoe;

import com.xin.spring.annotation.chapter20.prototyoe.bean.ProtoTypeCircularBeanA;
import com.xin.spring.annotation.chapter20.prototyoe.bean.ProtoTypeCircularBeanB;
import com.xin.spring.annotation.chapter20.prototyoe.config.ProtoTypeCircularConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author XYF
 * @date 2025-12-11 16:01
 */

public class ProtoTypeCirculatTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProtoTypeCircularConfig.class);
        ProtoTypeCircularBeanA protoTypeCircularBeanA = context.getBean(ProtoTypeCircularBeanA.class);
        System.out.println("protoTypeCircularBeanA===>>>" + protoTypeCircularBeanA);
        System.out.println("protoTypeCircularBeanB===>>>" + protoTypeCircularBeanA.getPrototypeCircularBeanB());
        context.close();
    }

}
