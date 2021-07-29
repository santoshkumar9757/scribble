package org.santosh.scribble.corejava;

import java.util.LinkedList;
import java.util.List;

public class Oops {
    Oops() {
        this("1");
    }
    Oops(String s) {
        System.out.println("super-"+s);
    }
    public void bark() {
        System.out.println("woof");
    }

    void say(List<String> list) {
        System.out.println("Parent");
    }
}

class Child extends Oops {
    Child(String s) {
        System.out.println("sub-"+s);
    }
    void say (List list) {
        System.out.println("Child");
    }
    public void sniff () {
        System.out.println("Sniff");
    }

    public void bark() {
        System.out.println("child howl");
    }

    public static void main(String[] args) {
        new Child("4").go();
        Child obj = new Child("2");
        obj.say(new LinkedList<String>());
    }

    private void go() {
        new Child("1").bark();
        ((Oops) new Child("2")).bark();
        //((Oops) new Child("3")).sniff();
    }
}

