package com.duyi.listenser;

import com.duyi.event.Event;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class Listenser3 {

    @EventListener
    public void test(Event eeve){
        eeve.print("事件3");
    }
}
