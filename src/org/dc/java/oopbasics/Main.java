package org.dc.java.oopbasics;

import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        //Animal animal = new Human();
        //animal.makeSound();
        //System.out.println("The value of pi is = " + "3.14");
        //whileloopExample();
        //Test Comment added
        //Change through IntelliJ
        arrayExample();
    }



    public static void arrayExample() {
        int[] arrayNum = {-10, 3, 27, 8, -34, 76, 1, 12};
        int sum = 0;
        double average = 0;

        for (int num:arrayNum) {
            sum = sum+ num;
            //sum+=num;
        }

        average = (double) sum/arrayNum.length;

        System.out.println("The sum is - " + sum + " and average is - " + average);


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
