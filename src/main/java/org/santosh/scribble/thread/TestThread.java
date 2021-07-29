package org.santosh.scribble.thread;

public class TestThread extends Thread {
    public static int x;
    public static synchronized void doThings() {
        int current = x;
        current++;
        x= current;
    }
    public void run() {
        doThings();
    }
}
