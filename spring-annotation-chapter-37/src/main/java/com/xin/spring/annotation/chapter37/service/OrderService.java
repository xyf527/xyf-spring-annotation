package com.xin.spring.annotation.chapter37.service;

import com.xin.spring.annotation.chapter37.dao.OrderDao;
import com.xin.spring.annotation.chapter37.dao.ProductDao;
import com.xin.spring.annotation.chapter37.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Random;

/**
 * @author XYF
 * @date 2025-12-26 11:18
 */

@Service
public class OrderService {

    @Autowired
    private OrderDao orderDao;

    @Autowired
    private ProductDao productDao;

    @Autowired
    private ProductService productService;


    @Transactional(propagation = Propagation.REQUIRED)
    public void submitOrder() {
        // 生成订单
        Order order = new Order();
        long number = Math.abs(new Random().nextInt(500));
        order.setId(number);
        order.setOrderNo("order_" + number);
        orderDao.saveOrder(order);

        // 减库存
        this.updateProductStockCountById(1, 1L);
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void updateProductStockCountById(Integer stockCount, Long id) {
        try {
            productDao.updateProductStockCountById(stockCount, id);
            int i = 1 / 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
