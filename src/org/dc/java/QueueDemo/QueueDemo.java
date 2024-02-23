package org.dc.java.QueueDemo;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
public class QueueDemo {
    public static void main(String[] args)
    {
        Queue<Integer> q = new LinkedList<>();
        //List<Integer> integerList = new ArrayList<>();
        // add 0,1,2,3,4
        for(int i = 0; i < 5; i++){
            q.add(i); // add to the queue
        }

        // Display the contents of the queue
        System.out.println("Queue elements are: " + q);

        // Remove head of the queue
        //int removeHead = q.remove();
        //System.out.println("Removed element: " + removeHead);
        System.out.println("Removed element: " + q.remove());
        // display new queue
        System.out.println("The full queue: " + q);
        // view the head of the queue
        System.out.println("New head of the queue is: " + q.peek());

        // Display size
        System.out.println("Size of the queue is: " + q.size());

        System.out.println("polled value is: " + q.poll());
        // display new queue
        System.out.println("The full queue: " + q);



    }
}
