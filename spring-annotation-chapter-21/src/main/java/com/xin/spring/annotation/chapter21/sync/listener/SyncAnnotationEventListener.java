package com.xin.spring.annotation.chapter21.sync.listener;

import com.xin.spring.annotation.chapter21.event.ListenerEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @author XYF
 * @date 2025-12-12 12:06
 */

@Component
public class SyncAnnotationEventListener {

    @EventListener(ListenerEvent.class)
    public void onApplicationEvent(ListenerEvent event) {
        if (ListenerEvent.EVENT_SYNC.equals(event.getName())) {
            System.out.println("同步事件监听器...");
        }
    }

}
