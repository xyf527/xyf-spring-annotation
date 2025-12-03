package com.xin.spring.annotation.chapter11.bean;

import org.springframework.stereotype.Component;

/**
 * @author XYF
 * @date 2025-12-03 16:02
 * @description TODO
 */

@Component
public class ValueName {

    private String name;
    public ValueName(){
        this.name = "xin";
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
