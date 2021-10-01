package org.santosh.scribble.designpattern.creational.factorypattern;

public class HDMIPort implements Port {
    @Override
    public void portType() {
        System.out.println("HDMI Port:");
    }

}
