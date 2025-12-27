package com.xin.spring.annotation.chapter37.entity;

import com.alibaba.druid.sql.visitor.functions.Right;

import java.math.BigDecimal;

/**
 * @author XYF
 * @date 2025-12-26 11:12
 */

public class Product {

    private Long id;
    private String productName;
    private BigDecimal productPrice;
    private Integer stockCount;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    public Integer getStockCount() {
        return stockCount;
    }

    public void setStockCount(Integer stockCount) {
        this.stockCount = stockCount;
    }
}
