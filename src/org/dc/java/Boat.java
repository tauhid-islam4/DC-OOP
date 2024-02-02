package org.dc.java;

public class Boat implements Vehicle{
    private int numberOfEngines;
    public Boat() {
        System.out.println("Inside Boat constructor.");

    }

    @Override
    public void run() {
        System.out.println("Boat is running!");
    }
}
