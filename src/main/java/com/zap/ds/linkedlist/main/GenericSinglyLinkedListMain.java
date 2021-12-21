package com.zap.ds.linkedlist.main;

import com.zap.ds.linkedlist.GenericSinglyLinkedList;

public class GenericSinglyLinkedListMain {

    public static void main(String[] args){

        GenericSinglyLinkedList<Integer> intLinkedList = new GenericSinglyLinkedList<>();
        intLinkedList.insertFirst(100);
        intLinkedList.insertFirst(200);
        //intLinkedList.insertFirst("100"); -- won't compile
        intLinkedList.display();
        intLinkedList.insertLast(300);
        System.out.println(intLinkedList.isEmpty());
        intLinkedList.display();
        intLinkedList.insertMiddle(2,400);
        intLinkedList.display();
        System.out.println(intLinkedList.linkedListLength(intLinkedList.first));
        intLinkedList.removeFromBegin();
        intLinkedList.display();

        GenericSinglyLinkedList<String> stringLinkedList = new GenericSinglyLinkedList<>();
        stringLinkedList.insertFirst("Java");
        stringLinkedList.insertFirst("Scala");
        stringLinkedList.display();
        //stringLinkedList.insertFirst(100); -- won't compile
        stringLinkedList.insertLast("Python");
        stringLinkedList.display();
        stringLinkedList.insertMiddle(1,"R");
        stringLinkedList.display();

        GenericSinglyLinkedList combinedLinkedList = new GenericSinglyLinkedList();
        combinedLinkedList.insertFirst("Java");
        combinedLinkedList.insertFirst("Scala");
        combinedLinkedList.display();
        combinedLinkedList.insertFirst(100); // No problem
        combinedLinkedList.insertLast("Python");
        combinedLinkedList.display();
        combinedLinkedList.insertMiddle(1,999);
        combinedLinkedList.display();

        stringLinkedList.removeFromLast();
        stringLinkedList.display();
        stringLinkedList.removeIntermediate(2);
        stringLinkedList.display();
    }
}
