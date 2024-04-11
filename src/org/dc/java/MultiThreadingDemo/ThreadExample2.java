package org.dc.java.MultiThreadingDemo;

// Define a class that implements the Runnable interface
class MyRunnable implements Runnable {
    public void run() {
        System.out.println("This code is running in a separate thread");
    }
}

public class ThreadExample2 {
    public static void main(String[] args) {
        // Create an instance of the class that implements Runnable
        MyRunnable myRunnable = new MyRunnable();

        // Create a Thread object, passing the Runnable instance to its constructor
        Thread thread = new Thread(myRunnable);

        // Start the thread
        thread.start();

        // Main thread continues to run concurrently with the new thread
        System.out.println("This code is running in the main thread");
    }
}

