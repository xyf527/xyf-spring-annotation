package com.xin.spring.annotation.chapter18;

import com.xin.spring.annotation.chapter18.config.PrePostConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author XYF
 * @date 2025-12-09 09:16
 */

public class PrePostTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PrePostConfig.class);
        context.close();
    }

}
