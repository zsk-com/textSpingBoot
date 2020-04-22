package com.duyi.listenser;

import com.duyi.event.Event;
import org.springframework.context.ApplicationListener;

public class listenser4 implements ApplicationListener<Event> {

    @Override
    public void onApplicationEvent(Event eeve) {
        eeve.print("事件监听4");
    }
}
