package com.LinkedList.problem;

public class Node {
    int data;
    Node next;

    public Node(int data, Node node) {
        this.data = data;
        this.next = node;
    }
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}


