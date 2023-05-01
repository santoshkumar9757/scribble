package org.santosh.scribble.corejava;

public class Generics<T> {

    void add(T t) {
        // some code
    }

    public static void main(String[] args) {
        Generics<String> gen = new Generics<>();
        gen.add("Santosh");
        gen.add("Shiva");
    }

}
