package org.santosh.scribble.multithreading;

public class ThreadResultsJoin {

    public static void main(String[] args) {
        JoinResults joinResults = new JoinResults(false);

        Thread t1 = new Thread(() -> {
            try {
                joinResults.printAlphabets();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread t2 = new Thread(() -> {
            try {
                joinResults.printNumbers();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        t1.setName("Alphabet");
        t2.setName("Number");

        t1.start();
        t2.start();
    }

    static class JoinResults {
        boolean flag;
        JoinResults (boolean flag) {
            this.flag = flag;
        }

        private void printAlphabets () throws InterruptedException {
            synchronized (this) {
                for (char alphaCount = 'A'; alphaCount <= 'D'; alphaCount++) {
                    while(flag) {
                        wait();
                    }
                    System.out.print(alphaCount);
                    flag = true;
                    notify();
                    Thread.sleep(1000);
                }
            }
        }

        private void printNumbers () throws InterruptedException {
            synchronized (this) {
                for (int numCount = 1; numCount <= 4; numCount++) {
                    while(!flag) {
                        wait();
                    }
                    System.out.print(numCount);
                    System.out.println();
                    flag = false;
                    notify();
                    Thread.sleep(500);
                }
            }
        }
    }
}
