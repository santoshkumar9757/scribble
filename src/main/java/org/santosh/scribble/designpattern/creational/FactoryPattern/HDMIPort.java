package org.santosh.scribble.designpattern.creational.FactoryPattern;

public class HDMIPort implements Port {
    @Override
    public void portType() {
        System.out.println("HDMI Port:");
    }
}
