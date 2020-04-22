package com.duyi.listen;

import com.duyi.even.Eeve;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class LIstenser2 implements ApplicationListener<Eeve> {
    @Override
    public void onApplicationEvent(Eeve eeve) {
        eeve.print("事件监听2");
    }
}
