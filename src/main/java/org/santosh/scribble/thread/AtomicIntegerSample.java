package org.santosh.scribble.thread;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerSample {
    private static AtomicInteger counter = new AtomicInteger(0);
    static class Decrement extends Thread {
        public void run() {
            counter.decrementAndGet();
        }
    }

    static class Increment extends Thread {
        public void run () {
            counter.incrementAndGet();
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new Increment().start();
            new Decrement().start();
        }
        System.out.println(counter);
    }
}
