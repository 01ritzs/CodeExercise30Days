package com.company.codingExercise30Days;


import com.company.codingExercise30Days.day15.Node;

public class LinkedList {

    Node head;
    int count;

//    public LinkedList(){
//        head = null;
//        count = 0;
//    }

    public LinkedList(Node newHead) {
        head = newHead;
        count = 1;
    }

    // Methods

    //add
    public void add(int newData) {
        Node temp = new Node(newData);
        Node current = head;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        current = temp;
        count++;
    }

    //get
    public int get(int index){
        if(index < 0){
            return -1;
        }
        Node current = head;
        for (int i = 1; i <= index; i++){
            current = current.getNext();
        }
        return current.getData();
    }

    //size
    public int size(){
        return count;
    }

    //isEmpty
    public boolean isEmpty() {
        return head == null;
    }

    //remove
    public void remove() {
        Node current = head;
        while (current.getNext().getNext() != null) {
            current = current.getNext();
        }
        current.setNext(null);
        count--;
    }

    public static void main(String[] args) {

    }
}
