package com.xin.spring.annotation.chapter08.bean;

/**
 * @author XYF
 * @date 2025-11-30 09:31
 * @description TODO
 */

public class Founder {

    private String name;

    public Founder(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + '\'' + '}';
    }
}
