package org.santosh.scribble.corejava;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ArrayPuzzles {

    public static void main(String[] args) {
        int a[] = {-1, -2, -3, -4, -5, -6};
        int n = a.length;
        createSubArrays(a, n);
        //reverseArray(a);
        Integer i = 10;
        Integer j = 20;
        //swap(i, j);
        //System.out.println("i = " + i + ", j = " + j);
        //farthestNumber(a);
    }

    private static void reverseArray(int[] a) {

        for (int j = a.length - 1; j >= 0; j--) {
            System.out.print(a[j] + " ");
        }
    }

    private static void farthestNumber(int [] a) {
        TreeSet<Integer> ts = new TreeSet();
        //int max = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i ++) {
            ts.add(a[i]);
           /* int diff = Math.abs(a[i]);
            if (diff > max) {
                max = diff;
            }*/

           int length = ts.size();
        }

        int max = ts.last();
        int min = ts.first();

        if (Math.abs(min) >= Math.abs(max)) {
            System.out.println(min);
        } else {
            System.out.println(max);
        }
        //System.out.println("Fathest from 0 " +max);
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

    private static boolean isProduct(int arr[], int n, int x) {
        // Create an empty set and insert first
        // element into it
        Set<Integer> hset = new HashSet<>();

        if(n < 2)
            return false;

        // Traverse remaining elements
        for(int i = 0; i < n; i++)
        {
            // 0 case must be handles explicitly as
            // x % 0 is undefined
            if(arr[i] == 0)
            {
                if(x == 0)
                    return true;
                else
                    continue;
            }

            // x/arr[i] exists in hash, then we
            // found a pair
            if(x % arr[i] == 0)
            {
                if(hset.contains(x / arr[i]))
                    return true;

                // Insert arr[i]
                hset.add(arr[i]);
            }
        }
        return false;
    }

}

