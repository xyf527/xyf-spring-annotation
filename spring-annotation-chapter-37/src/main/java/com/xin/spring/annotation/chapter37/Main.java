package com.xin.spring.annotation.chapter37;

import com.xin.spring.annotation.chapter37.config.MainConfig;
import com.xin.spring.annotation.chapter37.service.OrderService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author XYF
 * @date 2025-12-26 16:07
 */

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
        OrderService orderService = context.getBean(OrderService.class);
        orderService.submitOrder();
    }

}
