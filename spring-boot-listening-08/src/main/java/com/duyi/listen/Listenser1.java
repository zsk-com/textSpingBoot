package com.duyi.listen;

import com.duyi.even.Eeve;
import org.springframework.context.ApplicationListener;

public class Listenser1 implements ApplicationListener<Eeve> {
    @Override
    public void onApplicationEvent(Eeve eve) {
        eve.print("事件监听1");
    }
}
