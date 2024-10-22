package org.example.linkedList;

import org.w3c.dom.Node;

public class Main {
    public static void main(String[] args) {

        /*
        * How can I create a linked list now how to add the first element in my linked list, what should it contains
        * A node should be created, -> containing two things -> value and the next -> next will be null
        * head will points to that element only(How can we do this how to point the head to that element)
        * */
        LinkedList ll = new LinkedList(); //This will create a new linked list

        ll.insertAtFirst(15);
        ll.insertAtFirst(20);
        ll.insertAtFirst(10);

        ll.insertAtLast(40);
        ll.insertAtLast(60);

        ll.insertAtIndex(18, 3);
        ll.insertAtIndex(22, 6);
        ll.insertAtIndex(2, 1);
        ll.insertAtIndex(50, 0);

        ll.printLinkedList();

        ll.deleteAtFirst();
        ll.printLinkedList();

        ll.deleteAtLast();
        ll.printLinkedList();

        ll.deleteAtIndex(0);
        ll.printLinkedList();

        ll.deleteAtIndex(6);
        ll.printLinkedList();

        ll.deleteAtIndex(3);
        ll.printLinkedList();
    }
}
