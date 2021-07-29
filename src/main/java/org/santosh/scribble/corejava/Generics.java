package org.santosh.scribble.corejava;

public class Generics<T> {

    void add(T t) {
        // some code
    }

    public static void main(String[] args) {
        Generics<Number> gen = new Generics<>();
        gen.add(new Integer(1));
        gen.add(new Double(1.0));
    }

}
