package org.santosh.scribble.recursion;

public class MinMaxByRecursion {

    public static void main(String[] args) {
        int[] numArr = { 1, 4, 45, 6, -50, 10, 2 };
        // int n = A.length; // Iterate from from end
        int n = 0; // Iterate from beginning

        // Function calling
        System.out.println(findMinRec(numArr, n));
    }

    public static int findMinRec(int[] numArr, int n) {
        // if size = 0 means whole array has been traversed
        /*  if(n == 1)  // base condition
         return A[0]; */

        // if n is size of array, means whole array has been traversed
        if (n == numArr.length - 1) // base condition
            return numArr[n];

        // return Math.min(A[n - 1], findMinRec(A, n - 1));
        return Math.min(numArr[n], findMinRec(numArr, n + 1));
    }

}
