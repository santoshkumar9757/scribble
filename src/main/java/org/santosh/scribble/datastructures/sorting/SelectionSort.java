package org.santosh.scribble.datastructures.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5, 1, 4, 2, 8};
        int length = arr.length;

        for (int i = 0; i < length - 1; i++) {
            int min = i;

            for (int j = i + 1; j < length - 1; j ++) {
                if (arr[j] < arr[min]) {
                    min = j; // minimum index
                }
            }

            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        Arrays.stream(arr).forEach(System.out::print);
    }

}
