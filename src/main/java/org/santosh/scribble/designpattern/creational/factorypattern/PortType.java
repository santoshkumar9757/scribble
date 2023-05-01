package org.santosh.scribble.designpattern.creational.factorypattern;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.function.Supplier;

/*@RequiredArgsConstructor
@Getter*/
public enum PortType {

    /*HDMI(HDMIPort::new),
    USB(USBPort::new),
    LAN(LANPort::new);*/

    HDMI(new HDMIPort()),
    USB(new USBPort()),
    LAN(new LANPort());

    //private final Supplier<Port> constructor;

    private final Port constructor1;

    /*PortType(Supplier<Port> constructor) {
        this.constructor = constructor;
    }

    public Supplier<Port> getConstructor() {
        return constructor;
    }*/

    PortType(Port constructor) {
        this.constructor1 = constructor;
    }

    public Port getConstructor() {
        return constructor1;
    }
}
