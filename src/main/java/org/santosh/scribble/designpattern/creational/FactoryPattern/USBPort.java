package org.santosh.scribble.designpattern.creational.FactoryPattern;

public class USBPort implements Port {
    @Override
    public void portType() {
        System.out.println("USB Port:");
    }
}
