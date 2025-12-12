package com.xin.spring.annotation.chapter21.sync;

import com.xin.spring.annotation.chapter21.event.ListenerEvent;
import com.xin.spring.annotation.chapter21.sync.config.SyncEventListenerConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author XYF
 * @date 2025-12-12 12:10
 */

public class SyncEventListenerTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SyncEventListenerConfig.class);
        context.publishEvent(new ListenerEvent(new SyncEventListenerTest(), ListenerEvent.EVENT_SYNC));
        context.close();
    }

}
