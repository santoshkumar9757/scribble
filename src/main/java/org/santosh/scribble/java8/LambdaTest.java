package org.santosh.scribble.java8;

public class LambdaTest {

    public static void main(String[] args) {
        //CustomFunctionalInterface customFunctionalInterface = name -> name.toUpperCase();
        CustomFunctionalInterface customFunctionalInterface = String::toUpperCase;
        System.out.println(customFunctionalInterface.printMyNameInUpperCase("Santosh"));
    }


}
