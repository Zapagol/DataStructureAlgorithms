package com.zap.al.sort;

import com.zap.al.sort.MergeSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MergeSortTest {

    MergeSort ms = new MergeSort();
    private int[] arr = {7, 5, 8, 1, 10, 4};
    private int[] expectedResult = {1, 4, 5, 7, 8, 10};

    @Test
    void mergeSortTest(){
        int[] result = ms.mergeSort(arr, arr.length);
        Assertions.assertArrayEquals(expectedResult, result);
    }
}
