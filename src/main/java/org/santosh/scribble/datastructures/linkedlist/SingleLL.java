package org.santosh.scribble.datastructures.linkedlist;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SingleLL {

    private Node head;
    private int size;

    SingleLL() {
        this.size = 0;
    }

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
            size++;
        }
    }

    public void getSize() {
        System.out.println("");
        System.out.println("Size is: " + size);
    }

    public void insertFirst(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void insertLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    
    }

    public void insertAfter(int key, int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        // if only 1 node is present
        if (head.next == null) {
            head.next = newNode;
            return;
        }

        Node current = head;
        while (current.data != key) {
            current = current.next;
        }

        newNode.next = current.next;
        current.next = newNode;
    }

    public void insertBefore(int key, int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        // if only 1 node is present and it matches with given key
        if (head.data == key) {
            newNode.next = head;
            head = newNode;

        } else {
            Node previous = head;
            Node current = head.next;

            while (current.data != key && current.next != null) {
                previous = previous.next;
                current = current.next;
            }

            // check for last node not reached 
            if (current.next != null) {
                newNode.next = previous.next;
                previous.next = newNode;
                return;
            }

            size--; // decrement size as it is incremented by 1 in Node class constructor
            log.debug("Key: " + key + " is not present in list");
        }
    }

    public void printList() {

        if (head == null) {
            log.debug("List is empty");
            return;
        }

        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }

        System.out.print("NULL");
    }

    public void deleteFirst() {
        if (head == null) {
            log.debug("List is empty. Hence, nothing to delete");
            return;
        }
        size--;

        head = head.next;
    }

    public void deleteLast() {
        if (head == null) {
            log.debug("List is empty. Hence, nothing to delete");
            return;
        }

        // If only 1 node is present
        if (head.next == null) {
            head = null;
            return;
        }

        size--;

        Node secondLast = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            secondLast = secondLast.next;
            lastNode = lastNode.next;
        }

        secondLast.next = null;

    }

    public static void main(String[] args) {
        SingleLL list = new SingleLL();
        list.printList();

        list.insertFirst(2);
        list.printList();
        list.getSize();

        list.insertFirst(0);
        list.printList();
        list.getSize();

        list.insertLast(3);
        list.printList();
        list.getSize();

        list.insertBefore(2, 1);
        list.printList();
        list.getSize();

        list.insertBefore(5, 1);
        list.printList();
        list.getSize();

        list.insertAfter(2, 4);
        list.printList();
        list.getSize();

        list.deleteFirst();
        list.printList();
        list.getSize();

        list.deleteLast();
        list.printList();
        list.getSize();


    }

}
