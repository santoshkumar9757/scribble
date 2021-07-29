package org.santosh.scribble.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SampleExecutorService {
    public static void main(String[] args) throws InterruptedException{
        ExecutorService service =  Executors.newCachedThreadPool();
        service.submit(new Thread());
        service.shutdown();
    }

    static class Thread implements Runnable {

        @Override
        public void run() {
            System.out.println("Completed");

        }
    }
}
