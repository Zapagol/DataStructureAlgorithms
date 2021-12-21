package com.zap.ds.linkedlist.puzzles;

import com.zap.ds.linkedlist.Node;
import com.zap.ds.linkedlist.SinglyLinkedList;

public class AddOneToLL {

    // Node of the linked list
    static class Node {
        int data;
        Node next;
    }



    // Function to create a new node
    static Node create_Node(int data) {
        Node temp = new Node();
        temp.data = data;
        temp.next = null;
        return temp;
    }

    // Function to print the linked list
    static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    static Node addOne(Node head) {

        // To store the last node in the linked
        // list which is not equal to 9
        Node last = null;
        Node cur = head;

        // Iterate till the last node
        while (cur.next != null) {
            if (cur.data != 9) {
                last = cur;
            }
            cur = cur.next;
        }

        // If last node is not equal to 9
        // add 1 to it and return the head
        if (cur.data != 9) {
            cur.data++;
            return head;
        }

        // If list is of the type 9 . 9 . 9 ...
        if (last == null) {
            last = new Node();
            last.data = 0;
            last.next = head;
            head = last;
        }

        // For cases when the righmost node which
        // is not equal to 9 is not the last
        // node in the linked list
        last.data++;
        last = last.next;

        while (last != null) {
            last.data = 0;
            last = last.next;
        }
        return head;
    }

    // Driver code
    public static void main(String[] args) {
        Node head = create_Node(9);
        head.next = create_Node(9);
        //head.next.next = create_Node(9);
        //head.next.next.next = create_Node(9);

        System.out.print("Original list is : ");
        print(head);

        head = addOne(head);

        System.out.print("Resultant list is : ");
        print(head);
    }


}
