package com.xin.spring.annotation.chapter14;

import com.xin.spring.annotation.chapter14.config.ResourceConfig;
import com.xin.spring.annotation.chapter14.service.ResourceService;
import jakarta.annotation.Resource;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author XYF
 * @date 2025-12-05 16:50
 * @description TODO
 */

public class ResourceTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ResourceConfig.class);
        ResourceService resourceService = context.getBean(ResourceService.class);
        System.out.println(resourceService);

    }

}
