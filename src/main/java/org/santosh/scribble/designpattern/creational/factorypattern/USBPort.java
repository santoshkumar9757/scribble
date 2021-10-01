package org.santosh.scribble.designpattern.creational.factorypattern;

import java.util.stream.Stream;

public class USBPort implements Port {
    @Override
    public void portType() {
        System.out.println("USB Port:");
    }

    @Override
    public void portName() {
        System.out.println("Overridden default method in USB port");
    }

//    @Override
//    public void printMyName() {
//        Stream
//    }

}
