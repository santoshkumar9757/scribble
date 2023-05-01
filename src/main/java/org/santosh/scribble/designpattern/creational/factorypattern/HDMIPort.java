package org.santosh.scribble.designpattern.creational.factorypattern;

public class HDMIPort implements Port {

    private static final String DESCRIPTION = "This is HDMI Port.";

    @Override
    public void getDescription() {
        System.out.println(DESCRIPTION);
    }

}
