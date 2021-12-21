package com.zap.al.search;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BinarySearchUsingDivideAndConquerTest {

    BinarySearchUsingDivideAndConquer binarySearch = new BinarySearchUsingDivideAndConquer();

    @Test
    public void binarySearchKeyFound(){
        int[] arr = {10, 20, 30, 40, 50, 60};
        int index = binarySearch.binarySearchDivideAndConquer(50,arr);

        Assertions.assertEquals(4, index);
    }

    @Test
    public void binarySearchKeyNotFound(){
        int[] arr = {10, 20, 30, 40, 50, 60};
        int index = binarySearch.binarySearchDivideAndConquer(100,arr);

        Assertions.assertEquals(-1, index);
    }
}
