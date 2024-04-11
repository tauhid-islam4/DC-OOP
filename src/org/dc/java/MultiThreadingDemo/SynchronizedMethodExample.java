package org.dc.java.MultiThreadingDemo;

public class SynchronizedMethodExample {

    private static int count = 0;

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                increment();
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                increment();
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final count value: " + count);
    }

    // Synchronized method to increment count
    private synchronized static void increment() {
        count++;
    }
}

