package com.xin.spring.annotation.chapter20.special.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author XYF
 * @date 2025-12-11 15:50
 */

@Component
public class SpecialCircularBeanB {

    @Autowired
    private SpecialCircularBeanA specialCircularBeanA;

    @Override
    public String toString() {
        return "SpecialCircularBeanB{" +
                "specialCircularBeanA=" + specialCircularBeanA +
                '}';
    }
}
