package org.dc.java.MultiThreadingDemo;

public class SynchronizedBlockExample {

    private static int count = 0;
    private static final Object lock = new Object(); // Shared lock object

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

    // Method to increment count in a synchronized block
    private static void increment() {
        synchronized (lock) {
            count++;
        }
    }
}

