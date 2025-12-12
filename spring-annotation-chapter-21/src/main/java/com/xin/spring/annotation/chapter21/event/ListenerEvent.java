package com.xin.spring.annotation.chapter21.event;

import org.springframework.context.ApplicationEvent;

/**
 * @author XYF
 * @date 2025-12-12 12:03
 */

public class ListenerEvent extends ApplicationEvent {

    public static final String EVENT_SYNC = "sync";

    public static final String EVENT_ASYNC = "async";

    private String name;

    public ListenerEvent(Object source, String name) {
        super(source);
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
