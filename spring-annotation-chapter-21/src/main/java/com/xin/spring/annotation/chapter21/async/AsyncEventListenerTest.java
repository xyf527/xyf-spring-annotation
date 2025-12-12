package com.xin.spring.annotation.chapter21.async;

import com.xin.spring.annotation.chapter21.async.config.AsyncEventListenerConfig;
import com.xin.spring.annotation.chapter21.event.ListenerEvent;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author XYF
 * @date 2025-12-12 12:24
 */

public class AsyncEventListenerTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AsyncEventListenerConfig.class);
        context.publishEvent(new ListenerEvent(new AsyncEventListenerTest(), ListenerEvent.EVENT_ASYNC));
        context.close();
    }

}
