package com.zap.ds.linkedlist.main;

import com.zap.ds.linkedlist.SinglyLinkedList;
import com.zap.ds.linkedlist.puzzles.DetectLoopInLinkedList;

public class DetectLoopInLinkedListMain {

    public static void main(String[] args){
        SinglyLinkedList loopLinkedList = new SinglyLinkedList();
        DetectLoopInLinkedList detectLoopInLinkedList = new DetectLoopInLinkedList();

        loopLinkedList.insertFirst(20);
        loopLinkedList.insertFirst(4);
        loopLinkedList.insertFirst(15);
        loopLinkedList.insertFirst(10);

        /*Create loop for testing */
        loopLinkedList.first.next.next.next.next = loopLinkedList.first;

        //Using Floyd's algorithm
        System.out.println(detectLoopInLinkedList.hasLoop(loopLinkedList));

        //Using HashSet
        System.out.println(detectLoopInLinkedList.detectLoop(loopLinkedList));

        SinglyLinkedList nonLoopLinkedList = new SinglyLinkedList();

        nonLoopLinkedList.insertFirst(20);
        nonLoopLinkedList.insertFirst(4);
        nonLoopLinkedList.insertFirst(15);
        nonLoopLinkedList.insertFirst(10);

        //Using Floyd's algorithm
        System.out.println(detectLoopInLinkedList.hasLoop(nonLoopLinkedList));

        //Using HashSet
        System.out.println(detectLoopInLinkedList.detectLoop(nonLoopLinkedList));

    }
}
