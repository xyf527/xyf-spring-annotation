package com.xin.spring.annotation.chapter47.bean;

import java.io.Serializable;

/**
 * @author XYF
 * @date 2026-01-03 16:21
 */

public class User implements Serializable {

    private static final long serialVersionUID = 8989170361469703242L;
    private String id;
    private String name;

    public User(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
