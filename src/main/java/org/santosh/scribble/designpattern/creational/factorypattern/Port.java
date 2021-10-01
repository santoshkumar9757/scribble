package org.santosh.scribble.designpattern.creational.factorypattern;

public interface Port {

    void portType();
    /*static void display() {
        System.out.println("Hi Static");
    }*/
    default void portName() {
        System.out.println("Hi Default");
    }

    static void main(String[] args) {
        System.out.println("Hi Interface Port");
    }

}
