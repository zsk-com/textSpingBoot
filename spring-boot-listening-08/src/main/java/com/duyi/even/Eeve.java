package com.duyi.even;

import org.springframework.context.ApplicationEvent;

public class Eeve extends ApplicationEvent {

    public Eeve(Object source) {
        super(source);
    }

    public void print(String msg){
        System.out.println("执行了:"+msg);
    }
}
