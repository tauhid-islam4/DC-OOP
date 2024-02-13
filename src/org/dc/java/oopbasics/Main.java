package org.dc.java.oopbasics;

import java.io.IOException;
import java.util.StringTokenizer;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    // void - returns nothing
    // static - because we're not creating an object, it belongs to a class
    // rather than an instance of a class. So the method accessible to everything
    // instance of this Methods class
    // This method will add 2 number and display the result
    public static void addNumbers()
    {
        int sum = 5 + 10;
        System.out.println("5 + 10 = " + sum);
    }

    // Return a value - is passed 1 parameter
    public static int square(int num)
    {
        // return squared value
        return num * num;
    }

    // Returns 2 parameters
    public static int passing3Parmeters(int a, int b, int c)
    {
        // calculation
        int result = a * b * c;
        // return the result
        return result;
    }

    // METHOD OVERLOADING
    // number of parameters: 1
    public static void numberOfParameters(int a)
    {
        System.out.println("Parameters: " + a);
    }
    // number of parameters: 1
    public static void numberOfParameters(int a, int b)
    {
        System.out.println("Parameters: " + a + " and " + b);
    }

    // differnt data types
    // this accepts ints
    public static void dataTypes(int a)
    {
        System.out.println("Got integer data: " + a);
    }
    // this method accepts String
    public static void dataTypes(String a)
    {
        System.out.println("Got String data: " + a);
    }

    // METHOD RECURSION
    public static int factorial(int n)
    {
        if(n !=0) // terminating condition
            return n * factorial(n-1); // recursive call
        else
            return 1;
    }


    // Method 1
    // Concatenates to String
    public static void concat1(String s1)
    {
        s1 = s1 + " College";
    }

    // Method 2
    // Concatenates to StringBuilder
    public static void concat2(StringBuilder s2)
    {
        s2.append(" College");
    }

    // Method 3
    // Concatenates to StringBuffer
    public static void concat3(StringBuffer s3)
    {
        s3.append(" College");
    }

    public static void stringTokenizer() {
        // Constructor 1
        System.out.println("Using Constructor 1 - ");

        // Creating object of class inside main() method
        StringTokenizer st1 = new StringTokenizer(
                "This is OOP class");

        // Condition holds true till there is single token
        // remaining using hasMoreTokens() method
        while (st1.hasMoreTokens())
            // Getting next tokens
            System.out.println(st1.nextToken());

        // Constructor 2
        System.out.println("Using Constructor 2 - ");

        // Again creating object of class inside main()
        // method
        StringTokenizer st2 = new StringTokenizer(
                "JAVA : Code : String", " :");

        // If tokens are present
        while (st2.hasMoreTokens())

            // Print all tokens
            System.out.println(st2.nextToken());

        // Constructor 3
        System.out.println("Using Constructor 3 - ");

        // Again creating object of class inside main()
        // method
        StringTokenizer st3 = new StringTokenizer(
                "JAVA : Code : String", " :", true);

        while (st3.hasMoreTokens())
            System.out.println(st3.nextToken());
    }
    public static void main(String[] args) {

        // call the addNumbers method
//        addNumbers();
//
//        System.out.println("_____________________");
//
//        System.out.println("Squared value of 10 is: " + square(10));
//
//        System.out.println("_____________________");
//
//        // passing 3 parameters
//        System.out.println("2 * 4 * 6 = " + passing3Parmeters(2, 4, 6));
//
//        System.out.println("_____________________");
//
//        // calling a method inside a loop
//        for(int i = 1; i <=10; i++)
//        {
//            System.out.println("The square of " + i + " is " + square(i));
//        }
//
//        System.out.println("_____________________");
//        System.out.println("Overloading: Number of parameters");
//        numberOfParameters(1);
//        numberOfParameters(2);
//        numberOfParameters(3);
//        numberOfParameters(4);
//        numberOfParameters(5, 6);
//
//        System.out.println("Overloading: Data type of parameters");
//        dataTypes(1);
//        dataTypes("Hello world!");
//
//        System.out.println("_____________________");
//        System.out.println("Recursion:");
//        int number = 4, results;
//        results = factorial(number);
//        System.out.println(number + " factorial = " + results);

        // Custom input string
        // String 1
        String s1 = "Durham";

        // Calling above defined method
        concat1(s1);

        //s1 = s1 + " College";
        // s1 is not changed
        System.out.println("String: " + s1);

        // String 1
        StringBuilder s2 = new StringBuilder("Durham");

        // Calling above defined method
        concat2(s2);

        // s2 is changed
        System.out.println("StringBuilder: " + s2);

        // String 3
        StringBuffer s3 = new StringBuffer("Durham");

        // Calling above defined method
        concat3(s3);

        // s3 is changed
        System.out.println("StringBuffer: " + s3);

        //stringTokenizer();

        String str1 = "abc";
        String str2 = "abc";
        if (str1 == str2) {
            System.out.println("true");
        }
        else
            System.out.println("false");

        String str3 = new String("abcDeF");
        String str4 = new String("abcdEf");
        if (str4.equalsIgnoreCase(str3) ) {
            System.out.println("true");
        }
        else
            System.out.println("false");





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
