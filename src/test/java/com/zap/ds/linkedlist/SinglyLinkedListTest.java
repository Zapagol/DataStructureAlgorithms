package com.zap.ds.linkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SinglyLinkedListTest {

    SinglyLinkedList singlyLinkedList = new SinglyLinkedList();

    @BeforeEach
    void init(){
        Assertions.assertTrue(singlyLinkedList.isEmpty());
        Assertions.assertEquals(0, singlyLinkedList.size());
        singlyLinkedList.insertFirst(0);
    }


    @Test
    void insertFirstSpec(){
        singlyLinkedList.insertFirst(5);
        singlyLinkedList.insertFirst(10);
        singlyLinkedList.display();

        Assertions.assertFalse(singlyLinkedList.isEmpty());
        Assertions.assertEquals(3, singlyLinkedList.size());
    }

    @Test
    void insertLastSpec(){
        singlyLinkedList.insertLast(15);
        singlyLinkedList.insertLast(25);
        singlyLinkedList.display();

        Assertions.assertEquals(3, singlyLinkedList.size());
    }

    @Test
    void insertMiddleSpec(){
        singlyLinkedList.insertMiddle(0, 5);
        singlyLinkedList.display();
        singlyLinkedList.insertMiddle(1, 10);
        singlyLinkedList.display();

        Assertions.assertEquals(3, singlyLinkedList.size());
    }

    @Test
    void removeFromBeginSpec(){
        singlyLinkedList.insertFirst(5);
        singlyLinkedList.insertFirst(10);

        Assertions.assertEquals(3, singlyLinkedList.size());

        int result = singlyLinkedList.removeFromBegin();
        Assertions.assertEquals(10, result);
        Assertions.assertEquals(2, singlyLinkedList.size());
    }

    @Test
    void removeFromLastSpec(){
        singlyLinkedList.insertFirst(5);
        singlyLinkedList.insertFirst(10);

        Assertions.assertEquals(3, singlyLinkedList.size());

        Node result = singlyLinkedList.removeFromLast();
        Assertions.assertEquals(0, result.data);
        Assertions.assertEquals(2, singlyLinkedList.size());
    }

    @Test
    void removeIntermediateSpec(){
        singlyLinkedList.insertFirst(5);
        singlyLinkedList.insertFirst(10);

        Assertions.assertEquals(3, singlyLinkedList.size());

        singlyLinkedList.removeIntermediate(1);
        Assertions.assertEquals(2, singlyLinkedList.size());
    }
}
