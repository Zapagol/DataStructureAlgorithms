package com.zap.ds.linkedlist;

import com.zap.ds.linkedlist.puzzles.ReverseLinkedList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReverseLinkedListTest {

    ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
    SinglyLinkedList singlyLinkedList = new SinglyLinkedList();

    @Test
    void reverseSpec(){
        singlyLinkedList.insertFirst(5);
        singlyLinkedList.insertFirst(10);
        singlyLinkedList.insertFirst(15);
        singlyLinkedList.insertFirst(20);
        singlyLinkedList.display();

        SinglyLinkedList result = reverseLinkedList.reverse(singlyLinkedList);
        result.display();
        Assertions.assertEquals(singlyLinkedList, result);
    }
}
