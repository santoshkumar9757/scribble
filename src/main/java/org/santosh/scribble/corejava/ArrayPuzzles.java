package org.santosh.scribble.corejava;

public class ArrayPuzzles {

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6};
        int n = a.length;
        //createSubArrays(a, n);
        reverseArray(a);
        Integer i = 10;
        Integer j = 20;
        swap(i, j);
        System.out.println("i = " + i + ", j = " + j);
    }

    private static void reverseArray(int[] a) {

        for (int j = a.length - 1; j >= 0; j--) {
            System.out.print(a[j] + " ");
        }
    }

    private static void createSubArrays(int[] a, int n) {
        int sumOfSubArrays = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(a[k] + " ");
                    sumOfSubArrays = sumOfSubArrays + a[k];
                }
                System.out.println();
            }
        }
        System.out.println("Sum of Sub Arrays: " + sumOfSubArrays);
    }

    public static void swap(Integer i, Integer j) {
        Integer temp = new Integer(i);
        i = j;
        j = temp;
    }
}
