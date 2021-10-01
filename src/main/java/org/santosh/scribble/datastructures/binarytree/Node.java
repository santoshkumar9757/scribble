package org.santosh.scribble.datastructures.binarytree;

public class Node {
    int data;
    Node left;
    Node right;

    Node (int key) {
        data = key;
        left = right = null;
    }

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        int n = 150;
        while (n > 0) {
            n--;
            int temp = n%26;
            n /= 26;
            sb.append((char) ('A' + temp));
        }
        System.out.println("Excel Sheet column name:" + sb.reverse().toString());
    }
}
