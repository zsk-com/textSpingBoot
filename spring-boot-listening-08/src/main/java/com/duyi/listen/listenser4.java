package com.duyi.listen;

import com.duyi.even.Eeve;
import org.springframework.context.ApplicationListener;

public class listenser4 implements ApplicationListener<Eeve> {

    @Override
    public void onApplicationEvent(Eeve eeve) {
        eeve.print("事件监听4");
    }
}
