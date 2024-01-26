package org.dc.java.oopbasics;

public class Human extends Mammal{
    public Human() {
        super();
        System.out.println("Inside Human constructor");
    }
    @Override
    void move() {
        System.out.println("Human is moving");
    }

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("Inside Human makesound");
    }
}
