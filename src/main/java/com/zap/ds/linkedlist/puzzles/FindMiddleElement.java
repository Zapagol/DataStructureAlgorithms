package com.zap.ds.linkedlist.puzzles;

import com.zap.ds.linkedlist.Node;
import com.zap.ds.linkedlist.SinglyLinkedList;


/**
 * There are 2 ways to find middle element of LinkedList
 *
 * 1. Traverse the whole linked list and count the no. of nodes. Now traverse the list again till count/2
 * and return the node at count/2.
 *
 * 2. Traverse linked list using two pointers. Move one pointer by one and other pointer by two.
 * When the fast pointer reaches end slow pointer will reach middle of the linked list.
 */
public class FindMiddleElement {

    public Node findMiddleElement(SinglyLinkedList linkedList){
        Node slowPtr = linkedList.first;
        Node fastPtr = linkedList.first;

        while(fastPtr != null && fastPtr.next != null){
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
        }
        return slowPtr;
    }
}
