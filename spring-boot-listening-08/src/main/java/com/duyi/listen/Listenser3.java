package com.duyi.listen;

import com.duyi.even.Eeve;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class Listenser3 {

    @EventListener
    public void test(Eeve eeve){
        eeve.print("事件3");
    }
}
