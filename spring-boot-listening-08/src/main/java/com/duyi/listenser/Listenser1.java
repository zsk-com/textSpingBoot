package com.duyi.listenser;

import com.duyi.event.Event;
import org.springframework.context.ApplicationListener;

public class Listenser1 implements ApplicationListener<Event> {
    @Override
    public void onApplicationEvent(Event eve) {
        eve.print("事件监听1");
    }
}
