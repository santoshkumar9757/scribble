package org.santosh.scribble.designpattern.creational.factorypattern;

import java.time.LocalDateTime;

public class PortFactory {
    /*static Map<String, Port> portMap = new HashMap<>();
    static {
        portMap.put("USB", new USBPort());
        portMap.put("LAN", new LANPort());
        portMap.put("HDMI", new HDMIPort());
    }*/

    public static Port getPortType(PortType portType) {
        //return portType.getConstructor().get();
        return portType.getConstructor();

        /*return portMap.get(portType);*/
    }

    public static void main(String[] args) {
        //String portType = new Scanner(System.in).nextLine();
        //String portType = "USB";
        Port port = getPortType(PortType.HDMI);
        port.getDescription();
        port.portName();
        //Port.display();

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

       /* char[] chars = new char[] {'\u0097'};
        String str = new String(chars);
        byte[] bytes = str.getBytes();
        System.out.println(Arrays.toString(bytes));*/

    }
}
