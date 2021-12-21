package com.zap.ds.linkedlist.puzzles;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicateFromSortedLL {

    Node head;

    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    void removeDuplicates(){
        Node current = head;
        // Traverse list
        while (current != null){
            Node temp = current;
            /*Compare current node with the next node and
            keep on deleting them until it matches the current
            node data */
            while(temp != null && temp.data == current.data){
                temp = temp.next;
            }
            /*Set current node next to the next different
            element denoted by temp*/
            current.next = temp;
            current = current.next;
        }
    }

    /* Utility functions */

    /* Inserts a new Node at front of the list. */
    public void push(int new_data)
    {
        /* 1 & 2: Allocate the Node &
                  Put in the data*/
        Node new_node = new Node(new_data);

        /* 3. Make next of new Node as head */
        new_node.next = head;

        /* 4. Move the head to point to new Node */
        head = new_node;
    }

    /* Function to print linked list */
    void printList()
    {
        Node temp = head;
        while (temp != null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    /* Driver program to test above functions */
    public static void main(String args[])
    {
        String a = "strawberries";
        List<Boolean> list = new ArrayList<>();
        list.add(true);
        list.add(Boolean.parseBoolean("FalSe"));
        list.add(Boolean.TRUE);

        System.out.println(list.size());
        RemoveDuplicateFromSortedLL llist = new RemoveDuplicateFromSortedLL();
        llist.push(20);
        llist.push(13);
        llist.push(13);
        llist.push(11);
        llist.push(11);
        llist.push(11);

        System.out.println("List before removal of duplicates");
        llist.printList();

        llist.removeDuplicates();

        System.out.println("List after removal of elements");
        llist.printList();
    }
}
