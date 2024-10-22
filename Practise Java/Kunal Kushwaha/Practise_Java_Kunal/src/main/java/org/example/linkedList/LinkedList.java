package org.example.linkedList;

import org.w3c.dom.Node;

public class LinkedList {

    Node head;
    Node tail;

    public LinkedList() {
        this.size = 0;
    }
    int size;
    public void insertAtFirst(int val) {

        if (head == null) {
            head = new Node(val);
        } else {
            Node n = new Node(val);
            n.next = head;
            head = n;
        }
        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public void insertAtLast(int val) {
        if (tail == null) {
            insertAtFirst(val);
        } else {
            Node n = new Node(val);
            tail.next = n;
            tail = n;
            size++;
        }
    }

    public void insertAtIndex(int val, int index) {

        if (index > size) {
            System.out.println("Please enter the index within the range");
            return;
        }

        if (index == 0) {
            insertAtFirst(val);
            return;
        }

        if (index == size) {
            insertAtLast(val);
            return;
        }

        Node temp;
        temp = head;


        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node n = new Node(val);
        n.next = temp.next;
        temp.next = n;
        size++;
    }

    public void printLinkedList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println("\nTotal elements: " + size);
        System.out.println("Head: "+ head.value);
        System.out.println("Tail:" + tail.value);
    }

    public void deleteAtFirst() {
        if (head == null) {
            System.out.println("Sorry the Linked List is empty!!");
            return;
        }
        head = head.next;

        if(head == null){
            tail = null;
        }

        size--;
         

    }

    public void deleteAtLast() {
         

        Node temp;
        temp = head;

        while (temp.next != tail) {
            temp = temp.next;
        }

        tail = temp;
        tail.next = null;
        size--;

         

    }

    public void deleteAtIndex(int index) {
        if(index > size){
            System.out.println(" Please enter the index within the range");
            return;
        }

        if(index == 0 ){
            deleteAtFirst();
            return;
        }

        if(index == size){
            deleteAtLast();
            return;
        }

        Node temp;
        temp = head;
        for(int i  = 1 ; i < index ; i++){
            temp = temp.next;
        }

        temp.next = temp.next.next;
        size--;
    }


    private class Node {
        int value;
        Node next;

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

        public Node(int value) {
            this.value = value;
        }

        public Node(Node next) {
            this.next = next;
        }

        public Node() {

        }
    }
}
