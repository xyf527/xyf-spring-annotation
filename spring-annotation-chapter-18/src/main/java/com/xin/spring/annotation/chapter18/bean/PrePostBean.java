package com.xin.spring.annotation.chapter18.bean;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

/**
 * @author XYF
 * @date 2025-12-09 09:10
 */

public class PrePostBean {

    public PrePostBean() {
        System.out.println("执行PrePostBean的构造方法...");
    }

    public void init() {
        System.out.println("执行PrePostBean的init方法...");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("执行PrePostBean的postConstruct方法...");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("执行PrePostBean的preDestroy方法...");
    }

    public void destroy() {
        System.out.println("执行PrePostBean的destroy方法...");
    }

}
