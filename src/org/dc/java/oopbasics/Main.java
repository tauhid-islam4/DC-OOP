package org.dc.java.oopbasics;

import org.dc.java.oopbasics.Animal;
import org.dc.java.oopbasics.Human;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Animal animal = new Human();
        animal.makeSound();
        System.out.println("The value of pi is = " + "3.14");
        whileloopExample();
    }

    public static void doWhileloopExample() {
        int i=5;
        do {
            System.out.println("Value of i is = " + i);
        } while(i!=5);

        System.out.println("Value of i is = " + i++);


    }

    public static void whileloopExample() {
        int i=5;

        while (i!=5) {
            System.out.println("Value of i is = " + i);
        }
        System.out.println("Value of i is = " + i++);
    }
}
