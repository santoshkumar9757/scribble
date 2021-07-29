package org.santosh.scribble.corejava;

public class IntegerParseImplement {
    public static void main(String[] args) {
        //getIntegerFromString("120", 10);
        //findSubArrays();
        //missingNumber();
        getMaxDifferenceInArray();
    }

    private static void getIntegerFromString(String number, int radix) {
        int result = 0;
        char [] chars = number.toCharArray();
        for (int i = 0; i < chars.length; i ++) {
            int a = chars[i];
            a = a - 48;
            result =  result*radix + a;
        }
        System.out.println(result);
    }

    private static void findSubArrays() {
        int[] arr = {2, 3, 4, 6, 9, 0, 11};
        int result = 9;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == result) {
                    printSubArray(i, j, arr);
                }
            }
        }
    }

    private static void printSubArray(int i, int j, int[] arr) {
        for (int k = i; k <=j; k++) {
            System.out.print(arr[k]);
        }
        System.out.println();
       /* System.out.println(IntStream.range(i, j+1)
                .mapToObj(k -> arr[k])
                .collect(Collectors.toList()));*/
    }

    private static void missingNumber() {
        int []arr = {1, 2, 4, 5, 5, 6};
        for (int i = 1; i < arr.length; i++) {
            int diff = arr[i] - arr[i-1];
            if (diff > 1) {
                int missingNumber = arr[i] - 1;
                System.out.println("Missing number is: "+ missingNumber);
            }
            else if (diff == 0) {
                System.out.println("Duplicate number is:" + arr[i]);
            }
        }
    }

    private static void getMaxDifferenceInArray() {
        //int [] arr = {5, 3, 6, 7, 4};
        int[] arr = {5, 4, 3, 2, 1};

        int maxDifference = 0;

        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                int difference = arr[i] - arr[j];
                if (difference > maxDifference) {
                    maxDifference = difference;
                }
            }
        }
        if (maxDifference <= 0) {
            System.out.println("-1");
        } else {
            System.out.println("Max difference: " + maxDifference);
        }
    }
}

/*
Q : Implement functionality similar to Integer.parseInt(String number) and Integer.parseInt(String number, int radix)
        Input: Integer.parseInt("342")
        Output: 342
        Input: Integer.parseInt("342", 10)
        Output: 342
        Input: Integer.parseInt("100", 2)
        Output: 4
        Input: Integer.parseInt("777", 8)
        Output: 511*/

/*
Q:Find subarrays with given sum in an array.
        Input-
        int[] arr = {2, 3, 6, 4, 9, 0, 11};
        int num = 9
        Output-
        {3, 6}
        {9},
        {9,0}*/
/*

Q:Find Missing number in a sorted array:
        Original array: [1, 2, 3, 4, 5, 6]
        Input: {1, 2, 4, 5, 5, 6}
        Array is sorted, but not contiguous.
        Output: missing number 3
        Repeated number 5*/
