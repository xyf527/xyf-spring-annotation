package com.xin.spring.annotation.chapter20.prototyoe.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author XYF
 * @date 2025-12-11 15:56
 */

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class ProtoTypeCircularBeanA {

    @Autowired
    private ProtoTypeCircularBeanB protoTypeCircularBeanB;

    public ProtoTypeCircularBeanB getPrototypeCircularBeanB() {
        return protoTypeCircularBeanB;
    }

}
