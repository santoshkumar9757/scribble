package org.santosh.scribble.datastructures.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {5, 1, 4, 2, 8};

/*        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }*/
       // Arrays.stream(array).forEach(System.out :: print);

        sortInSingleLoop(array);
    }

    private static void sortInSingleLoop(int[] arr) {
        // Sorting using a single loop
        for (int j = 0; j < arr.length - 1; j++) {

            // Checking the condition for two
            // simultaneous elements of the array
            if (arr[j] > arr[j + 1]) {

                // Swapping the elements.
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;

                // updating the value of j = -1
                // so after getting updated for j++
                // in the loop it becomes 0 and
                // the loop begins from the start.
                j = -1;
            }
        }

        Arrays.stream(arr).forEach(System.out :: print);
    }
}
