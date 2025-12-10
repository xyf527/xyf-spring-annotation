package com.xin.spring.annotation.chapter19.bean;

/**
 * @author XYF
 * @date 2025-12-10 19:26
 */

public class ProfileBean {

    private String env;

    public ProfileBean(String env) {
        this.env = env;
    }

    @Override
    public String toString() {
        return "ProfileBean{" +
                "env='" + env +
                '}';
    }
}
