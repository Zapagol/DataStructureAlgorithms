package com.zap.ds.linkedlist;

import com.zap.ds.linkedlist.puzzles.OccurenceOfInteger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OccurenceOfIntegerTest {

    OccurenceOfInteger occurenceOfInteger = new OccurenceOfInteger();
    SinglyLinkedList linkedList = new SinglyLinkedList();


    @Test
    void occurenceOfInteger(){
        linkedList.insertFirst(1);
        linkedList.insertFirst(2);
        linkedList.insertFirst(1);
        linkedList.insertFirst(2);
        linkedList.insertFirst(1);
        linkedList.insertFirst(3);

        int result1 = occurenceOfInteger.occurenceOfInteger(linkedList, 1);
        Assertions.assertEquals(3, result1);

        int result2 = occurenceOfInteger.occurenceOfInteger(linkedList, 3);
        Assertions.assertEquals(1, result2);
    }
}
