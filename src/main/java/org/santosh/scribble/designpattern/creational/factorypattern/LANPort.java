package org.santosh.scribble.designpattern.creational.factorypattern;

public class LANPort implements  Port{

    @Override
    public void portType() {
        System.out.println("LAN port:");
    }

    @Override
    public void portName () {
        System.out.println("This is overriden default in LANPort");
    }
}
