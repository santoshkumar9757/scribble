package org.santosh.scribble.corejava;

public class PassByValue {

    /*https://www.geeksforgeeks.org/g-fact-31-java-is-strictly-pass-by-value/*/
    /*https://www.geeksforgeeks.org/how-to-make-object-eligible-for-garbage-collection/*/

    public static void swap(Integer i, Integer j) {
        Integer temp = i;
        i = j;
        j = temp;
    }

    public static void main(String[] args) {
        Integer i = 10;
        Integer j = 20;
        swap(i, j);
        System.out.println(" i = " + i + ", j = " + j);
    }
}
