package com.zap.al.sort;

import com.zap.al.sort.InsertionSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InsertionSortTest {

    InsertionSort is = new InsertionSort();
    private int[] inputArr = {7, 2, 4, 1, 5, 3};
    private int[] expectedResult = {1, 2, 3, 4, 5, 7};

    @Test
    void insertionSortTest(){
        int[] result = is.insertionSort(inputArr, inputArr.length);
        Assertions.assertArrayEquals(expectedResult, result);
    }
}
