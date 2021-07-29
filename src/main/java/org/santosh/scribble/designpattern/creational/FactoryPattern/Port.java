package org.santosh.scribble.designpattern.creational.FactoryPattern;

public interface Port {

    void portType();
    static void display() {
        System.out.println("Hi Static");
    }
    default void portName() {
        System.out.println("Hi Default");
    }
}
