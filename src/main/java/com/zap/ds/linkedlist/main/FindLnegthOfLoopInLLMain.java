package com.zap.ds.linkedlist.main;

import com.zap.ds.linkedlist.SinglyLinkedList;
import com.zap.ds.linkedlist.puzzles.FindLnegthOfLoopInLL;

public class FindLnegthOfLoopInLLMain {
    public static void main(String[] args){
        SinglyLinkedList loopLinkedList1 = new SinglyLinkedList();
        FindLnegthOfLoopInLL findLength = new FindLnegthOfLoopInLL();

        loopLinkedList1.insertFirst(20);
        loopLinkedList1.insertFirst(4);
        loopLinkedList1.insertFirst(15);
        loopLinkedList1.insertFirst(10);

        /*Create loop for testing */
        loopLinkedList1.first.next.next.next.next = loopLinkedList1.first;

        System.out.println("Length of loop in LinkedList = " + findLength.findLengthOfLoop(loopLinkedList1));

        SinglyLinkedList loopLinkedList2 = new SinglyLinkedList();

        loopLinkedList2.insertFirst(10);
        loopLinkedList2.insertFirst(20);
        loopLinkedList2.insertFirst(30);
        loopLinkedList2.insertFirst(40);
        loopLinkedList2.insertFirst(50);
        loopLinkedList2.insertFirst(60);

        /*Create loop for testing */
        loopLinkedList2.first.next.next.next.next.next = loopLinkedList2.first;
        System.out.println("Length of loop in LinkedList = " + findLength.findLengthOfLoop(loopLinkedList2));
    }
}
