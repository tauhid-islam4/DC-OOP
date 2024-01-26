package org.dc.java.oopbasics;

public abstract class Mammal implements Animal{
    boolean coldBlooded = false;
    Mammal (){
        System.out.println("Inside Mammal Default constructor!");
    }

    abstract void move() ;
    @Override
    public void makeSound() {
        System.out.println("Mammal is making a sound");
    }
}
