package org.santosh.scribble.java8;

@FunctionalInterface
public interface CustomFunctionalInterface {
    String printMyNameInUpperCase(String name);

   /* static void main(String[] args) {
        CustomFunctionalInterface customFunctionalInterface = str -> {
            String name = "";
            name = name.concat(str);
            return name;
        };
        System.out.println(customFunctionalInterface.printMyName("Santosh"));
    }*/
}


