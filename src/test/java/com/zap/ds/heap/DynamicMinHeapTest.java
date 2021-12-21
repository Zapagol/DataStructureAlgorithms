package com.zap.ds.heap;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DynamicMinHeapTest {

    DynamicMinHeap dynamicMinHeap = new DynamicMinHeap();

    @Test
    void addSpec(){
        int[] expected = {5, 10, 20, 15, 18};
        Assertions.assertTrue(dynamicMinHeap.isEmpty());
        Assertions.assertEquals(0, dynamicMinHeap.size());

        dynamicMinHeap.add(15);
        dynamicMinHeap.add(10);
        dynamicMinHeap.add(20);
        dynamicMinHeap.add(5);
        dynamicMinHeap.add(18);

        int[] actual = dynamicMinHeap.heapArray();

        Assertions.assertEquals(5, dynamicMinHeap.size());
        Assertions.assertFalse(dynamicMinHeap.isEmpty());

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void deleteSpec(){
        int[] expected1 = {10, 15, 18, 20};
        int[] expected2 = {15, 18, 20};
        Assertions.assertTrue(dynamicMinHeap.isEmpty());
        Assertions.assertEquals(0, dynamicMinHeap.size());

        dynamicMinHeap.add(15);
        dynamicMinHeap.add(10);
        dynamicMinHeap.add(20);
        dynamicMinHeap.add(5);
        dynamicMinHeap.add(18);

        Assertions.assertEquals(5, dynamicMinHeap.size());
        Assertions.assertFalse(dynamicMinHeap.isEmpty());

        int value1 = dynamicMinHeap.delete();
        int[] actual1 = dynamicMinHeap.heapArray();
        Assertions.assertArrayEquals(expected1, actual1);

        int value2 = dynamicMinHeap.delete();
        //Assertions.assertArrayEquals(expected2, dynamicMinHeap.heapArray());

        Assertions.assertEquals(3, dynamicMinHeap.size());
        Assertions.assertEquals(5, value1);
        Assertions.assertEquals(10, value2);
    }

    @Test
    void peekSpec(){
        Assertions.assertTrue(dynamicMinHeap.isEmpty());
        Assertions.assertEquals(0, dynamicMinHeap.size());

        dynamicMinHeap.add(15);
        dynamicMinHeap.add(10);
        dynamicMinHeap.add(20);
        dynamicMinHeap.add(25);

        Assertions.assertEquals(4, dynamicMinHeap.size());

        int peekValue = dynamicMinHeap.peek();
        Assertions.assertEquals(10, peekValue);
    }
}
