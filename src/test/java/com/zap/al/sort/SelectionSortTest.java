package com.zap.al.sort;

import com.zap.al.sort.SelectionSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SelectionSortTest {

    SelectionSort ss = new SelectionSort();
    private int[] inputArr = {10, 9, 2, 11, 30, 21};
    private int[] expectedResult = {2, 9, 10, 11, 21, 30};

    @Test
    void selectionSortTest(){
        int[] result = ss.selectionSort(inputArr);
        Assertions.assertArrayEquals(expectedResult, result);
    }
}
