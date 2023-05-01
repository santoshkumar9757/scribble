package org.santosh.scribble.designpattern.creational.factorypattern;

public class USBPort implements Port {

    private static final String DESCRIPTION = "This is USB Port.";

    @Override
    public void getDescription() {
        System.out.println(DESCRIPTION);
    }

    @Override
    public void portName() {
        System.out.println("Overridden default method in USB port");
    }


}
