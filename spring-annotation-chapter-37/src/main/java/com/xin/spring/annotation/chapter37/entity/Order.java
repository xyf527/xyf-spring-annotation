package com.xin.spring.annotation.chapter37.entity;

/**
 * @author XYF
 * @date 2025-12-26 11:12
 */

public class Order {

    private Long id;
    private String orderNo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }
}
