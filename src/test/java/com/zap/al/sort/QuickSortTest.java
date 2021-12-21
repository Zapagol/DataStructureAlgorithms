package com.zap.al.sort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QuickSortTest {

    QuickSort qSort = new QuickSort();

    private int[] arr = {7, 2, 1, 6, 8, 5, 3, 4};
    private int[] expected = {1, 2, 3, 4, 5, 6, 7, 8};

    @Test
    void quickSortTest(){
        int[] result = qSort.quickSort(arr, 0, arr.length - 1);
        Assertions.assertArrayEquals(result, expected);
    }
}
