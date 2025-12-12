package com.xin.spring.annotation.chapter21.async.listener;

import com.xin.spring.annotation.chapter21.event.ListenerEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @author XYF
 * @date 2025-12-12 12:15
 */

@Component
public class AsyncAnnotationEventListener {

    @EventListener(ListenerEvent.class)
    public void onApplicationEvent(ListenerEvent event) {
        if (ListenerEvent.EVENT_ASYNC.equals(event.getName())) {
            System.out.println("异步事件监听器...");
        }
    }

}
