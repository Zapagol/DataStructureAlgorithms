package com.zap.al.sort;

import com.zap.al.sort.BubbleSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BubbleSortTest {

    BubbleSort bs = new BubbleSort();
    int[] intArray = {4, 9, 2, 11, 30, 21};
    int[] expectedResult = {2, 4, 9, 11, 21, 30};

    @Test
    public void bubbleSort1(){
        int[] result = bs.bubbleSort1(intArray);

        Assertions.assertArrayEquals(expectedResult, result);
    }

    @Test
    public void bubbleSort2(){
        int[] result = bs.bubbleSort2(intArray);
        Assertions.assertArrayEquals(expectedResult, result);
    }

    @Test
    public void bubbleSort3(){
        int[] result = bs.bubbleSort(intArray);
        Assertions.assertArrayEquals(expectedResult, result);
    }

}
