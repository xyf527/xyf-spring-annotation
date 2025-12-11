package com.xin.spring.annotation.chapter20.singleton.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author XYF
 * @date 2025-12-11 17:22
 */

@Component
public class SingletonCircularBeanB {

    @Autowired
    private SingletonCircularBeanA singletonCircularBeanA;

    public SingletonCircularBeanA getSingletonCircularBeanA() {
        return singletonCircularBeanA;
    }

}
