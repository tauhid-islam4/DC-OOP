package org.dc.java.LinkedList;


import java.util.List;

public class LinkedList {
    Node head;
    public void add (int data){

        // check if linked list is empty
        if(this.head == null) {
            // yes, the linked list is empty
            // create a new node with data, set it
            // equal to the head of the list
            this.head = new Node(data);
        }
        else
        {
            // not empty
            //create a new node
            Node nodeToAdd = new Node(data);
            // set the current head or previious head equal
            // to the next node we want to add
            nodeToAdd.next = this.head;
            // add this head
            this.head = nodeToAdd;
        }
    }

    //This method removes the first element of the Linked list and returns the new head
    public Node remove() {
        this.head = this.head.next;
        return this.head;
    }

    public void remove(int position) {
        int index = 1;
        Node newHead = this.head;
        Node prev = newHead;
        while (index<position) {
            prev = newHead;
            newHead = newHead.next;
            index++;
        }
        prev.next = newHead.next;
    }
    public static void main(String[] args){
        LinkedList myList = new LinkedList();
        myList.add(10);
        myList.add(18);
        myList.add(37);
        myList.add(11);
        myList.add(28);
        myList.add(38);


        Node head = myList.head;
        while(head!=null) {
            System.out.println(head.data);
            head= head.next;
        }

        System.out.println("After Removing element : " );
        myList.remove(2);

        head = myList.head;
        while(head!=null) {
            System.out.println(head.data);
            head= head.next;
        }
    }
}

// node
class Node {
    int data;
    Node next;
    Node (int d) {
        this.data = d;
    }
}