package com.zap.ds.linkedlist.main;

import com.zap.ds.linkedlist.SinglyLinkedList;
import com.zap.ds.linkedlist.puzzles.StartNodeOfLoopInLL;

public class StartNodeOfLoopInLLMain {
    public static void main(String[] args){
        SinglyLinkedList loopLinkedList = new SinglyLinkedList();
        StartNodeOfLoopInLL startNode = new StartNodeOfLoopInLL();

        loopLinkedList.insertFirst(20);
        loopLinkedList.insertFirst(4);
        loopLinkedList.insertFirst(15);
        loopLinkedList.insertFirst(10);
        loopLinkedList.insertFirst(30);

        /*Create loop for testing */
        loopLinkedList.first.next.next.next.next = loopLinkedList.first;
        System.out.println("Start Node of a loop = " + startNode.findStartNodeofLoop(loopLinkedList).data);

        SinglyLinkedList loopLinkedList2 = new SinglyLinkedList();

        loopLinkedList2.insertLast(5);
        loopLinkedList2.insertLast(6);
        loopLinkedList2.insertLast(7);
        loopLinkedList2.insertLast(1);
        loopLinkedList2.insertLast(2);


        System.out.println("Start Node of a loop = " + startNode.findStartNodeofLoop(loopLinkedList2));
    }
}
