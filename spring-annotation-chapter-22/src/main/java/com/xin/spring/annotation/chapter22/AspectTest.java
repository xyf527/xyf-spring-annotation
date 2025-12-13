package com.xin.spring.annotation.chapter22;

import com.xin.spring.annotation.chapter22.bean.AspectBean;
import com.xin.spring.annotation.chapter22.config.AspectConfig;
import com.xin.spring.annotation.chapter22.service.AspectService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author XYF
 * @date 2025-12-13 17:04
 */

public class AspectTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AspectConfig.class);
        AspectService aspectService = context.getBean(AspectService.class);
        aspectService.saveOrUpdateAspectBean(new AspectBean());
    }

}
