package org.santosh.scribble.thread;

import java.util.LinkedList;

public class ProducerConsumerProblem {

    public static void main(String[] args) {
        ProdConsume prodConsume = new ProdConsume();

        Thread t1 = new Thread(() -> {
            try {
                prodConsume.addItems();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread t2 = new Thread(() -> {
            try {
                prodConsume.removeItems();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        t1.start();
        t2.start();
    }

    public static class ProdConsume {
        final LinkedList<Integer> list = new LinkedList<>();
        int capacity = 2;

        // produce one item and immediately after that make the consumer consume it
        //boolean flag = false;

        public void addItems() throws InterruptedException {
            int value = 0;
            synchronized (this) {
                for (int i = 0; i < capacity; i++) {
                    while (list.size() == capacity) {
                    /*while (flag) {*/
                        wait();
                        //System.out.println("List is full");
                    }
                    System.out.println("Added value ->" + value);
                    //flag = true;
                    list.add(value++);
                    notify();
                    // makes the working of program easier to understand
                    Thread.sleep(1000);
                }
            }
        }

        public void removeItems() throws InterruptedException {
            synchronized (this) {
                for (int i = 0; i < capacity; i++) {
                    while (list.isEmpty()) {
                    /*while (!flag) {*/
                        wait();
                        // System.out.println("List is empty");
                    }
                    int value = list.removeFirst();
                    System.out.println("Removed value ->" + value);
                    //flag = false;
                    notify();

                    // makes the working of program easier to  understand
                    Thread.sleep(1000);
                }
            }
        }
    }
}
