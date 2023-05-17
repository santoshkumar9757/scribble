package org.santosh.scribble.datastructures.linkedlist;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DoublyLinkList {

    private Node head;
    private Node tail;
    private int size;

    DoublyLinkList() {
        this.size = 0;
    }

    private class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            size++;
        }
    }

    public void insertFirst(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }

        newNode.next = head;
        newNode.prev = null;
        head.prev = newNode;
        head = newNode;

    }

    public void insertLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;

    }

    public void insertAfterKey(int key, int data) {
        Node newNode = new Node(data);

        if (isListEmpty()) {
            System.out.println("List is empty");
            return;
        }

        if (tail.data == key) {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            tail.next = null;

            return;
        }

        Node current = head;
        while (current.next != null) {
            if (current.data == key) {
                Node next = current.next;
                current.next = newNode;
                newNode.prev = current;
                newNode.next = next;
                next.prev = newNode;
            }
            current = current.next;
        }
    }

    public void deleteFirst() {
        if (isListEmpty()) {
            return;
        }

        size--;

        System.out.println("Deleting: " + head.data);

        // If only single node is present
        if (isSingleNodePresent()) {
            head = null;
            return;
        }

        head = head.next;
        head.prev = null;
        
    }

    public void deleteLast() {
        if (isListEmpty()) {
            return;
        }

        size--;

        System.out.println("Deleting: " + tail.data);

        // If only single node is present
        if (isSingleNodePresent()) {
            head = null;
            return;
        }

        tail = tail.prev;
        tail.next = null;
    }

    public void deleteBeforeKey(int key) {
        if (isListEmpty()) {
            return;
        }

        if(isSingleNodePresent()) {
            System.out.println("Only 1 node is present. Hence, no node to be deleted");
            return;
        }

        Node deletedNode = head;
        Node current = head.next;
        while (current.next != null && current.data != key) {
            deletedNode = deletedNode.next;
            current = current.next;
        }

        // if key is found
        if(current.data == key) {
            size--;
            System.out.println("Node: " + deletedNode.data +" is deleted");

            Node temp = deletedNode.prev;
            temp.next = current;
            current.prev = temp;

            return;
        }

        log.debug("Key: " + key + " is not present in list");

    }

    public void deleteAfterKey(int key) {
        if (isListEmpty()) {
            return;
        }

        if(isSingleNodePresent()) {
            System.out.println("Only 1 node is present. Hence, no node to be deleted");
            return;
        }

        if (tail.prev.data == key) {
            System.out.println("Given key: " + key + " is the second last node");
            System.out.println("Node: " + tail.data + " is deleted");
            tail = tail.prev;
            tail.next = null;
            return;
        }

        Node current = head;
        Node deletedNode = head.next;
        while(current.next != null && current.data != key) {
            current = current.next;
            deletedNode = deletedNode.next;
        }

        // If key is found and deletedNode is not the last node
        if (current.data == key) {
            size--;
            System.out.println("Node: " + deletedNode.data + " is deleted");

            Node temp = deletedNode.next;
            current.next = temp;
            temp.prev = current;

            return;
        }

        log.debug("Key: " + key + " is not present in list");
    }

    public void display() {
        if (isListEmpty()) {
            return;
        }

        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.print("TAIL");
        System.out.println("");

        // Printing backwards
        current = tail;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.prev;
        }
        System.out.print("HEAD");
        System.out.println("");


    }

    public void getSize() {
        System.out.println("Size is: " + size);
    }

    private boolean isListEmpty() {
        return head == null;
    }

    private boolean isSingleNodePresent() {
       return head.next == null;
    }

    public static void main(String[] args) {
        DoublyLinkList list = new DoublyLinkList();
        list.insertFirst(1);
        list.display();
        list.getSize();

        // list.deleteFirst();
        // list.getSize();
        // list.printForward();

        // list.deleteLast();
        // list.getSize();
        // list.printForward();

        list.insertFirst(0);
        list.display();
        list.getSize();

        // System.out.println("printing backwards");
        // list.printBackward();

        list.deleteFirst();
        list.getSize();
        list.display();

        list.insertLast(2);
        list.display();
        list.getSize();

        list.insertLast(3);
        list.display();
        list.getSize();

        list.insertLast(5);
        list.display();
        list.getSize();

        list.insertAfterKey(3, 4);
        list.display();
        list.getSize();

        list.deleteBeforeKey(3);
        list.display();
        list.getSize();

        list.deleteBeforeKey(6);
        list.display();
        list.getSize();

        list.insertLast(7);
        list.display();
        list.getSize();

        list.deleteAfterKey(3);
        list.display();
        list.getSize();

        list.deleteAfterKey(6);
        list.display();
        list.getSize();

        list.deleteAfterKey(3);
        list.display();
        list.getSize();


        // System.out.println("printing backwards");
        // list.printBackward();

        // list.deleteLast();
        // list.getSize();
        // list.printForward();

    }

}
