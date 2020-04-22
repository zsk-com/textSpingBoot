package com.duyi.event;

import org.springframework.context.ApplicationEvent;

public class Event extends ApplicationEvent {

    public Event(Object source) {
        super(source);
    }

    public void print(String msg){
        System.out.println("执行了:"+msg);
    }
}
