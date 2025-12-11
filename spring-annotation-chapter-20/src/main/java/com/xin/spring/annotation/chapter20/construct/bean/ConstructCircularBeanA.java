package com.xin.spring.annotation.chapter20.construct.bean;

import org.springframework.stereotype.Component;

/**
 * @author XYF
 * @date 2025-12-11 17:03
 */

@Component
public class ConstructCircularBeanA {

    private ConstructCircularBeanB constructCircularBeanB;

    private ConstructCircularBeanA(ConstructCircularBeanB constructCircularBeanB){
        this.constructCircularBeanB = constructCircularBeanB;
    }

    public ConstructCircularBeanB getConstructCircularBeanB() {
        return constructCircularBeanB;
    }

}
