package com.xin.spring.annotation.chapter29.event;

import org.springframework.context.ApplicationEvent;

/**
 * @author XYF
 * @date 2025-12-25 19:37
 */

public class MyApplicationEvent extends ApplicationEvent {

    public MyApplicationEvent(Object source) {
        super(source);
    }

}
