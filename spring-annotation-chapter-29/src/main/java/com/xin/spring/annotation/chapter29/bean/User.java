package com.xin.spring.annotation.chapter29.bean;

import java.io.Serializable;
import java.util.UUID;

/**
 * @author XYF
 * @date 2025-12-18 17:04
 */

public class User implements Serializable {

    private static final long serialVersionUID = -6463799304609746213L;
    private String id;
    private String name;

    public User() {
        this.id = UUID.randomUUID().toString().replace("-", "");
    }

    public User(String name) {
        this.id = UUID.randomUUID().toString().replace("-", "");
        this.name = name;
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
