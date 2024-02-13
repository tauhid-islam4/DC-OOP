package org.dc.java.LinkedList;


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

    public static void main(String[] args){
        LinkedList myList = new LinkedList();
        myList.add(10);
        myList.add(18);
        System.out.println(myList.head.data);
        System.out.println(myList.head.next.data);
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