package org.santosh.scribble.designpattern.creational.factorypattern;

public class LANPort implements Port {

    private static final String DESCRIPTION = "This is LAN Port.";

    @Override
    public void getDescription() {
        System.out.println(DESCRIPTION);
    }

    @Override
    public void portName() {
        System.out.println("This is overriden default in LANPort");
    }
}
