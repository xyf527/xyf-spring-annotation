package com.xin.spring.annotation.chapter46.bean;

import java.io.Serializable;

/**
 * @author XYF
 * @date 2026-01-02 16:56
 */

public class User implements Serializable {

    private static final long serialVersionUID = -4714178763598258102L;
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
