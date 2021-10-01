package org.santosh.scribble.datastructures.linkedlist;

public class SingleLinkedList {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public SingleLinkedList insertNodeLast(SingleLinkedList linkedList, int data) {
        Node lastNode = new Node(data);

        if (linkedList.head == null) {
            linkedList.head = lastNode;
        } else {
            Node current = linkedList.head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = lastNode;
        }
        printList(linkedList);
        return linkedList;
    }

    public SingleLinkedList insertNodeFirst(SingleLinkedList linkedList, int data) {
        Node firstNode = new Node(data);

        if (linkedList.head == null) {
            linkedList.head = firstNode;
        } else {
            Node temp = linkedList.head;
            linkedList.head = firstNode;
            firstNode.next = temp;
        }
        printList(linkedList);
        return linkedList;
    }

    public SingleLinkedList insertBeforeKey(SingleLinkedList linkedList, int key, int data) {
        Node newNode = new Node(data);

        if (linkedList.head == null) {
            linkedList.head = newNode;
        } else {
            Node current = linkedList.head;
            Node prev = null;
            while (current != null && current.data != key) {
                prev = current;
                current = current.next;
            }
            prev.next = newNode;
            newNode.next = current;
        }
        printList(linkedList);
        return linkedList;
    }

    private SingleLinkedList insertAfterKey(SingleLinkedList linkedList, int key, int data) {
        Node newNode = new Node(data);

        if (linkedList.head == null) {
            linkedList.head = newNode;
        } else {
            Node current = linkedList.head;
            Node after = null;
            while (current != null && current.data != key) {
                current = current.next;
            }
            after = current.next;
            current.next = newNode;
            newNode.next = after;
        }
        printList(linkedList);
        return linkedList;
    }

    public static SingleLinkedList deleteNodeByKey(SingleLinkedList linkedList, int key) {
        Node prev = null;
        Node current = linkedList.head;

        if (current != null && current.data == key) {
            linkedList.head = current.next;
            System.out.println(key + " found and deleted at head");
            return linkedList;
        }
        while (current != null && current.data != key) {
            prev = current;
            current = current.next;
        }
        if (current != null) {
            prev.next = current.next;
            System.out.println(key + " found and deleted");
        }
        if (current == null) {
            System.out.println(key + " is not found");
        }
        printList(linkedList);
        return linkedList;
    }

    public static SingleLinkedList deleteNodeByIndex(SingleLinkedList linkedList, int index) {
        Node current = linkedList.head;
        Node prev = null;
        int counter = 0;

        if (index == 0 && current != null) {
            linkedList.head = current.next;
            System.out.println(index + " node found and deleted");
            printList(linkedList);
            return linkedList;
        }
        while (current != null) {
            if (counter == index) {
                prev.next = current.next;
                System.out.println(index + " node found and deleted");
                break;
            } else {
                prev = current;
                current = current.next;
                counter++;
            }
        }
        printList(linkedList);
        return linkedList;
    }


    public static void printList(SingleLinkedList linkedList) {
        Node currentNode = linkedList.head;
        while (currentNode != null) {
            System.out.print(currentNode.data + "->");
            currentNode = currentNode.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SingleLinkedList linkedList = new SingleLinkedList();
        linkedList = linkedList.insertNodeLast(linkedList, 10);
        linkedList = linkedList.insertNodeLast(linkedList, 20);
        linkedList = linkedList.insertNodeLast(linkedList, 30);
        linkedList = linkedList.insertBeforeKey(linkedList, 20, 15);
        linkedList = linkedList.insertAfterKey(linkedList, 20, 25);
        linkedList = deleteNodeByKey(linkedList, 30);
        //System.out.println("----After Deletion ---");

        linkedList = linkedList.insertNodeFirst(linkedList, 30);
        linkedList = deleteNodeByIndex(linkedList, 1);
    }

}
