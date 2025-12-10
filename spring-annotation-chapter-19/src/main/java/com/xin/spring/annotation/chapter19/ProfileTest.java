package com.xin.spring.annotation.chapter19;

import com.xin.spring.annotation.chapter19.bean.ProfileBean;
import com.xin.spring.annotation.chapter19.config.ProfileConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author XYF
 * @date 2025-12-10 19:29
 */

public class ProfileTest {

    public static void main(String[] args) {
       /* AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.getEnvironment().setActiveProfiles("prod");
        context.register(ProfileConfig.class);
        context.refresh();
        ProfileBean profileBean = context.getBean(ProfileBean.class);*/
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProfileConfig.class);
        ProfileBean profileBean = context.getBean(ProfileBean.class);
        System.out.println(profileBean);
    }

}
