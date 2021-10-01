package org.santosh.scribble.java8;

@CustomAnnotation(username = "Shiva")
public class LambdaTest {

    public static void main(String[] args) {
        CustomFunctionalInterface customFunctionalInterface = (name) -> name.toUpperCase();
        //CustomFunctionalInterface customFunctionalInterface = String::toUpperCase;
        System.out.println(customFunctionalInterface.printMyNameInUpperCase("Santosh"));
    }


}
