package org.santosh.scribble.designpattern.creational.factorypattern;

public interface Port {

    void getDescription();

    /*static void display() {
        System.out.println("Hi Static");
    }*/

    default void portName() {
        System.out.println("Hi Default");
    }

    static void main(String[] args) {
        System.out.println("Hi Interface Port");
    }

    /*private void display() {
        System.out.println("Private method in interface");
    }*/

}
