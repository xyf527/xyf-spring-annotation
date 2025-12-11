package com.xin.spring.annotation.chapter20.proxy.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @author XYF
 * @date 2025-12-11 16:56
 */

@Component
public class ProxyCircularBeanB {

    @Autowired
    private ProxyCircularBeanA proxyCircularBeanA;

    @Async
    public ProxyCircularBeanA getProxyCircularBeanA() {
        return proxyCircularBeanA;
    }
}
