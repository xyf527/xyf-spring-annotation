package com.xin.spring.annotation.chapter20.prototyoe.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author XYF
 * @date 2025-12-11 15:58
 */

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class ProtoTypeCircularBeanB {

    @Autowired
    private ProtoTypeCircularBeanA protoTypeCircularBeanA;

    public ProtoTypeCircularBeanA getPrototypeCircularBeanA() {
        return protoTypeCircularBeanA;
    }

}
