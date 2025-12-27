package com.xin.spring.annotation.chapter37.dao;

import com.xin.spring.annotation.chapter37.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author XYF
 * @date 2025-12-26 11:14
 */

@Repository
public class OrderDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int saveOrder(Order order) {
        String sql = "insert into order_info (id, order_no) values (?, ?)";
        return jdbcTemplate.update(sql, order.getId(), order.getOrderNo());
    }

}
