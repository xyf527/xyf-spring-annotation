package com.xin.spring.annotation.chapter20.proxy.bean;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @author XYF
 * @date 2025-12-11 16:55
 */

@Component
public class ProxyCircularBeanA {

    @Autowired
    private ProxyCircularBeanB proxyCircularBeanB;

    @Async
    public ProxyCircularBeanB getProxyCircularBeanB() {
        return proxyCircularBeanB;
    }

}
