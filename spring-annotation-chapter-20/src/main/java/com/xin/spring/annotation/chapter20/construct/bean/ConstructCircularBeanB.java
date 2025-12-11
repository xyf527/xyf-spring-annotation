package com.xin.spring.annotation.chapter20.construct.bean;

import org.springframework.stereotype.Component;

/**
 * @author XYF
 * @date 2025-12-11 17:03
 */

@Component
public class ConstructCircularBeanB {

    private ConstructCircularBeanA constructCircularBeanA;

    public ConstructCircularBeanB(ConstructCircularBeanA constructCircularBeanA) {
        this.constructCircularBeanA = constructCircularBeanA;
    }

    public ConstructCircularBeanA getConstructCircularBeanA() {
        return constructCircularBeanA;
    }

}
