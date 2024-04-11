package org.dc.java.MultiThreadingDemo;

// Define a custom thread class by extending Thread
class MyThread extends Thread {
    public void run() {
        System.out.println("This code is running in a separate thread");
    }
}

public class ThreadExample1 {
    public static void main(String[] args) {
        // Create an instance of our custom thread
        MyThread thread = new MyThread();

        // Start the thread
        thread.start();

        // Main thread continues to run concurrently with the new thread
        System.out.println("This code is running in the main thread");
    }
}

