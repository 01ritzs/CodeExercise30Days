package com.company.codingExercise30Days.day15;

public class Node {

    int data;
    Node next;

    //Constructor

    public Node(int newData){
        data = newData;
        next = null;
    }

    public Node(int newData, Node newNext){
        data = newData;
        next = newNext;
    }

    //Getter and Setter

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
