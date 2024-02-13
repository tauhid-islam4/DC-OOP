package org.dc.java.NodeDemo;

public class Node {
    private int data;
    private Node nextNode;

    public Node (int data){
        this.data = data;
    }

    public int getData() {
        return this.data;
    }
    public Node getNextData() {
        return this.nextNode;
    }
    public void setData(int data){
        this.data = data;
    }
    public void setNextNode(Node nextNode){
        this.nextNode = nextNode;
    }


}

