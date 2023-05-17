package org.santosh.scribble.datastructures.linkedlist;

public class CircularLL {

    private Node head;
    private Node tail;
    private int size;

    public CircularLL() {
        this.size = 0;
    }

    class Node {
        int data;
        Node next; // in circular ll, next is never NULL

        Node(int data) {
            this.data = data;
            size++;
        }
    }

    public void insertLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.next = head;
        tail = newNode;

    }

    public void insertAfterKey(int key, int data) {
        Node newNode = new Node(data);

        Node current = head;
        do {
            if (current.data == key) {
                Node temp = current.next;
                current.next = newNode;
                newNode.next = temp;
            }
            current = current.next;
        } while (current != head);
    }

    public void deleteKey(int key) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        size--;

        if (head.data == key) {
            head = head.next;
            tail.next = head;
            return;
        }

        Node previous = head;
        Node current = head.next;
        do {
            if (current.data == key) {
                previous.next = current.next;
                break;
            }
            previous = previous.next;
            current = current.next;

        } while (current != head);
    }

    public void display() {
        Node current = head;

        if (head != null) {
            do {
                System.out.print(current.data + " -> ");
                current = current.next;

            } while (current != head);
        }
        System.out.println("HEAD");
    }

    public static void main(String[] args) {
        CircularLL list = new CircularLL();
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(4);
        list.display();

        list.deleteKey(1);
        list.display();

        list.deleteKey(3);
        list.display();

        list.insertAfterKey(2, 3);
        list.display();

    }

}
