package org.santosh.scribble.spring;

import org.springframework.stereotype.Component;

@Component
public class BeanLifeCycleB {

   private BeanLifeCycleA beanLifeCycleA;

   public BeanLifeCycleB(BeanLifeCycleA beanLifeCycleA) {
       this.beanLifeCycleA = beanLifeCycleA;
   }

    public void display() {
        System.out.println("Value of A:" +beanLifeCycleA.getA());
    }

}
