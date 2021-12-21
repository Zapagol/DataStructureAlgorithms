package com.zap.ds.linkedlist.puzzles;

import com.zap.ds.linkedlist.SinglyLinkedList;
import com.zap.ds.linkedlist.Node;

/**
 * 1. Use two pointer firstPtr and secondPtr and initialize both to head of linkedlist
 * 2. Move firstPtr by n-1 nodes.
 * 3. Increment firstPtr and secondPtr until firstPtr.next not equal to null.
 *    SecondPtr will be at nth from end node.
 */
public class NthElementFromEnd {

    public static void main(String[] args) {
        SinglyLinkedList linkedList = new SinglyLinkedList();
        linkedList.insertFirst(5);
        linkedList.insertFirst(15);
        linkedList.insertFirst(20);
        linkedList.insertFirst(40);
        linkedList.insertFirst(30);
        linkedList.insertFirst(100);

        findNthElement(linkedList, 4);

    }

    public static void findNthElement(SinglyLinkedList linkedList, int number){
        Node firstPtr = linkedList.first;
        Node secondPtr = linkedList.first;

        for(int i=0; i<number; i++){
            firstPtr = firstPtr.next;
        }
        while (firstPtr != null){
            firstPtr = firstPtr.next;
            secondPtr = secondPtr.next;
        }

        System.out.println(number + "th node from end is :" + secondPtr.data);
    }

}
