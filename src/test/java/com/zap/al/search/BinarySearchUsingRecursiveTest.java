package com.zap.al.search;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BinarySearchUsingRecursiveTest {

    BinarySearchUsingRecursive bsRecursive = new BinarySearchUsingRecursive();

    @Test
    public void testBinarySearchRecursiveWithValueFound(){
        int[] arr = {10, 20, 30, 40, 50, 60};
        int index = bsRecursive.binarySearchWithRecursive(arr, 0, (arr.length - 1), 20);

        Assertions.assertEquals(1, index);
    }

    @Test
    public void testBinarySearchRecursiveWithoutValueFound(){
        int[] arr = {10, 20, 30, 40, 50, 60};
        int index = bsRecursive.binarySearchWithRecursive(arr, 0, (arr.length - 1), 100);

        Assertions.assertEquals(-1, index);
    }
}
