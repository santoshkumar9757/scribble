package org.santosh.scribble.spring;

import org.springframework.stereotype.Component;

@Component
public class BeanLifeCycleA {
    private int a;

    private BeanLifeCycleA () {
        this.a = 5;
    }

    public int getA() {
        return this.a;
    }
}
