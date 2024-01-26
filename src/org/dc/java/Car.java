package org.dc.java;

public class Car implements Vehicle{
    private int numOfWheels;
    public Car() {
        System.out.println("Inside Car constructor.");
    }

    public Car(int numOfWheels) {
        this.numOfWheels = numOfWheels;
        System.out.println("Inside Car constructor with wheels.");
    }

    @Override
    public void run() {
        System.out.println("Car is running!");
    }
}
