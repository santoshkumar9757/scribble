package org.santosh.scribble.designpattern.creational;

public enum SingletonEnum {
    INSTANCE;

    // Field variables like value are not serialized.
    //https://dzone.com/articles/java-singletons-using-enum
    int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}

class EnumDemo {
    public static void main(String[] args) {
        SingletonEnum singletonEnum = SingletonEnum.INSTANCE;
        singletonEnum.setValue(1);
        System.out.println(singletonEnum.getValue());
    }
}
