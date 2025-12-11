package com.xin.spring.annotation.chapter20.dependson.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

/**
 * @author XYF
 * @date 2025-12-11 17:18
 */

@Component
@DependsOn("dependsOnCircularBeanA")
public class DependsOnCircularBeanB {

    @Autowired
    private DependsOnCircularBeanA dependsOnCircularBeanA;

    public DependsOnCircularBeanA getDependsOnCircularBeanA() {
        return dependsOnCircularBeanA;
    }

}
