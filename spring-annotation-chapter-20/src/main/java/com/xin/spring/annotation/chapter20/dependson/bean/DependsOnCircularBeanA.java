package com.xin.spring.annotation.chapter20.dependson.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

/**
 * @author XYF
 * @date 2025-12-11 17:17
 */

@Component
@DependsOn("dependsOnCircularBeanB")
public class DependsOnCircularBeanA {

    @Autowired
    private DependsOnCircularBeanB dependsOnCircularBeanB;

    public DependsOnCircularBeanB getDependsOnCircularBeanB() {
        return dependsOnCircularBeanB;
    }

}
