package org.santosh.scribble.designpattern.structural.adapter;

public class Sparrow implements Bird{

    @Override
    public void fly() {
        System.out.println("Sparrow Flying");
    }

    @Override
    public void makeSound() {
        System.out.println("Sparrow Chirping");

    }
}
