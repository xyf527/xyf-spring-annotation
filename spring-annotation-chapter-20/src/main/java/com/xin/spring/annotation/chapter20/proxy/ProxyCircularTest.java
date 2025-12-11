package com.xin.spring.annotation.chapter20.proxy;

import com.xin.spring.annotation.chapter20.proxy.bean.ProxyCircularBeanA;
import com.xin.spring.annotation.chapter20.proxy.bean.ProxyCircularBeanB;
import org.springframework.aop.framework.ProxyConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author XYF
 * @date 2025-12-11 16:57
 */

public class ProxyCircularTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProxyConfig.class);
        ProxyCircularBeanA proxyCircularBeanA = context.getBean(ProxyCircularBeanA.class);
        System.out.println("proxyCircularBeanA===>>>" + proxyCircularBeanA);
        System.out.println("proxyCircularBeanB===>>>" + proxyCircularBeanA.getProxyCircularBeanB());
        context.close();
    }

}
