package org.santosh.scribble.designpattern.creational.factorypattern;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class PortFactory {
    static Map<String, Port> portMap = new HashMap<>();
    static {
        portMap.put("USB", new USBPort());
        portMap.put("LAN", new LANPort());
        portMap.put("HDMI", new HDMIPort());
    }

    public Port getPortType(String portType) {
        /*if ("USB".equals(portType)) {
            return new USBPort();
        } else if ("LAN".equals(portType)) {
            return new LANPort();
        } else if ("HDMI".equals(portType)) {
            return new HDMIPort();
        }
        return null;*/

        // To replace multiple if else statements, Map can be used as below:
    return portMap.get(portType);
    }

    public static void main(String[] args) {
        //String portType = new Scanner(System.in).nextLine();
        String portType = "USB";
        Port port = new PortFactory().getPortType(portType);
        port.portType();
        port.portName();
        //Port.display();

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
    }
}
