package org.dc.java;

public class Bicycle implements Vehicle{
    public int getNumOfWheels() {
        return numOfWheels;
    }

    public void setNumOfWheels(int numOfWheels) {
        this.numOfWheels = numOfWheels;
    }

    private int numOfWheels;

    public Bicycle() {
        System.out.println("Inside Bicycle constructor.");
    }

    public Bicycle(int numOfWheels) {
        this.numOfWheels = numOfWheels;
        System.out.println("Inside Bicycle constructor with Wheels.");
    }

    @Override
    public void run() {
        System.out.println("Bicycle is running!");
    }
}
