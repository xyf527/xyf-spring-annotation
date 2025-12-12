package com.xin.spring.annotation.chapter21.sync.listener;

import com.xin.spring.annotation.chapter21.event.ListenerEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * @author XYF
 * @date 2025-12-12 12:05
 */

@Component
public class SyncEventListener implements ApplicationListener<ListenerEvent> {

    @Override
    public void onApplicationEvent(ListenerEvent event) {
        if (ListenerEvent.EVENT_SYNC.equals(event.getName())) {
            System.out.println("同步事件监听器...");
        }
    }
}
