package com.xin.spring.annotation.chapter20.special.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author XYF
 * @date 2025-12-11 15:49
 */

@Component
public class SpecialCircularBeanA {

    @Autowired
    private SpecialCircularBeanB specialCircularBeanB;

    @Override
    public String toString() {
        return "SpecialCircularBeanA{" +
                "specialCircularBeanB=" + specialCircularBeanB +
                '}';
    }
}
