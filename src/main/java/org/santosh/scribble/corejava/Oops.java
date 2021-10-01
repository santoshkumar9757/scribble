package org.santosh.scribble.corejava;

import java.util.List;

public class Oops {
    Oops() {
        //this("1");
        System.out.println("Super Oops");
    }
    Oops(String s) {
        System.out.println("super-"+s);
    }
    public void bark() {
        System.out.println("woof");
    }

    public static void main(String args[]) {
    }

    void say(List<String> list) {
        System.out.println("Parent");
    }
}

class Child extends Oops {
    Child(String s) {
        //super();
        System.out.println("sub-"+s);
    }
    void say (List list) {
        System.out.println("Child");
    }
    public void sniff () {
        System.out.println("Sniff");
    }

    public void bark() {
        System.out.println("Child bark");
    }

    private void go() {
        new Child("1").bark();
        //((Oops) new Child("2")).bark("");
        ((Oops) new Child("2")).bark();
        Oops oops = new Child("3");
        oops.bark();
    }

    public static void main(String[] args) {
        new Child("4").go();
      /*  Child obj = new Child("2");
        obj.say(new LinkedList<String>());*/
        //((Oops) new Child("4")).sniff();
        /*Oops oops = new Child("4");
        ((Child) oops).sniff();*/
    }

    // If a constructor does not explicitly invoke a superclass constructor,
    // the Java compiler automatically inserts a call to the no-argument constructor of the superclass.
    // If the superclass does not have a no-argument constructor, you will get a compile-time error.
    // Object class does have such a constructor, so if Object is the only superclass, there is no problem

}

