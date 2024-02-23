package org.dc.java.StackDemo;
import java.util.*;
public class StackDemo {
    public static void main(String[] args){
        // create an empty stack
        Stack<String> stack = new Stack<String>();
        // use push() to add elemetns to the stack
        stack.push("Hello!");
        stack.push("My");
        stack.push("Name");
        stack.push("is");
        stack.push("Goose");


        // display the stack
        System.out.println("The initial stack: " + stack);

        // display element at the head of the stack
        System.out.println("Element at the top of the stack is: " + stack.peek());

        // push something onto the top of the stack
        stack.push("and I love naps");

        // display the new element at the top of the stack
        System.out.println("New the element at the top of the stack is: " + stack.peek());

        // Display the new stack
        System.out.println("The new stack: " + stack);

        // remove element (pop) from the stack
        System.out.println("Pop the top element off the stack: " + stack.pop());

        // Display the new stack
        System.out.println("The final stack: " + stack);

        // push new element to the stack
        System.out.println("Push new element onto the stack: " + stack.push("and I love belly rubs"));
        // Display the new stack
        System.out.println("The final final stack: " + stack);
    }
}
