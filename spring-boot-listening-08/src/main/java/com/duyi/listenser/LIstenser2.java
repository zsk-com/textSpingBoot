package com.duyi.listenser;

import com.duyi.event.Event;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class LIstenser2 implements ApplicationListener<Event> {
    @Override
    public void onApplicationEvent(Event eeve) {
        eeve.print("事件监听2");
    }
}
