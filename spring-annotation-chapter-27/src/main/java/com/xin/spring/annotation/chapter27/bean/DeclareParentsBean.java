package com.xin.spring.annotation.chapter27.bean;

/**
 * @author XYF
 * @date 2025-12-17 15:40
 */

public class DeclareParentsBean {

    public static final String NAME = "xin";
    private String name;
    public DeclareParentsBean() {}

    public DeclareParentsBean(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "DeclareParentsBean{" +
                "name='" + name + '\'' +
                '}';
    }
}
