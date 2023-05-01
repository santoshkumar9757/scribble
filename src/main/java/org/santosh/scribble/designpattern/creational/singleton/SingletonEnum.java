package org.santosh.scribble.designpattern.creational.singleton;

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

        System.out.println(singletonEnum.getValue());
        singletonEnum.setValue(2);
        System.out.println(singletonEnum.getValue());
    }
}
