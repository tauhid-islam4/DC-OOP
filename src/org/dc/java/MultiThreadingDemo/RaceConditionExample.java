package org.dc.java.MultiThreadingDemo;

public class RaceConditionExample {

    static int count = 0;

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                count++; // Increment count
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                count++; // Increment count
            }
        });

        thread1.start();
        thread2.start();

        // Wait for both threads to finish
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final count value: " + count);
    }
}

