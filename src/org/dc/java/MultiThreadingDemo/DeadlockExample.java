package org.dc.java.MultiThreadingDemo;

public class DeadlockExample {

    // Create two shared objects
    private static final Object lock1 = new Object();
    private static final Object lock2 = new Object();

    public static void main(String[] args) {
        // Thread 1 acquires lock1 then tries to acquire lock2
        Thread thread1 = new Thread(() -> {
            synchronized (lock1) {
                System.out.println("Thread 1: Holding lock1...");
                try {
                    Thread.sleep(100); // Simulating some operation
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread 1: Waiting for lock2...");
                synchronized (lock2) {
                    System.out.println("Thread 1: Holding lock1 and lock2...");
                }
            }
        });

        // Thread 2 acquires lock2 then tries to acquire lock1
        Thread thread2 = new Thread(() -> {
            synchronized (lock2) {
                System.out.println("Thread 2: Holding lock2...");
                try {
                    Thread.sleep(100); // Simulating some operation
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread 2: Waiting for lock1...");
                synchronized (lock1) {
                    System.out.println("Thread 2: Holding lock2 and lock1...");
                }
            }
        });

        // Start both threads
        thread1.start();
        thread2.start();

        // Wait for threads to finish
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // This part is reached only if threads complete
        System.out.println("Main thread exiting.");
    }
}

