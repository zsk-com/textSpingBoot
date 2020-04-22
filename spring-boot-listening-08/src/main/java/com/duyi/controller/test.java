package com.duyi.controller;

import com.duyi.event.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test {
    @Autowired
    ApplicationEventPublisher publisher;

    @RequestMapping("/test")
    public String test(){
        publisher.publishEvent(new Event(this));
        return "success";
    }
}
