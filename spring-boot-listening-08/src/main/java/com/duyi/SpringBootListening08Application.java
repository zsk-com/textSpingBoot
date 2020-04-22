package com.duyi;

import com.duyi.even.Eeve;
import com.duyi.listen.Listenser1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootListening08Application {

    @Autowired
    ApplicationEventPublisher publisher;

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(SpringBootListening08Application.class, args);
        run.addApplicationListener(new Listenser1());


    }

}
