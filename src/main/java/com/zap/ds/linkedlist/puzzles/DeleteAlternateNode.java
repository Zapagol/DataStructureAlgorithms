package com.zap.ds.linkedlist.puzzles;

import com.zap.ds.linkedlist.Node;
import com.zap.ds.linkedlist.SinglyLinkedList;

public class DeleteAlternateNode {

    static Node deleteAlternateNodes(Node head){
        if (head == null)
            return null;

        Node current = head;
        Node next = head.next;

        while (current != null && next != null)
        {
            /* Change next link of previus node */
            current.next = next.next;

            /* Free node - This is optional*/
            next = null;

            /*Update prev and now */
            current = current.next;
            if (current != null)
                next = current.next;
        }

        return head;
    }

    static void printList(Node head){
        while (head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String[] args){
        SinglyLinkedList ll = new SinglyLinkedList();

        ll.insertFirst(6);
        ll.insertFirst(5);
        ll.insertFirst(4);
        ll.insertFirst(3);
        ll.insertFirst(2);
        ll.insertFirst(1);

        printList(ll.first);
        System.out.println();
        Node head = deleteAlternateNodes(ll.first);
        printList(head);

    }
}
