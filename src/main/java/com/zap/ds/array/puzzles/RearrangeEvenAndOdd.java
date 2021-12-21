package com.zap.ds.array.puzzles;

import java.util.Arrays;

/**
 * Rearrange array such that even index elements are smaller and odd index elements are greater
 *
 * Given an array, rearrange the array such that :
 *
 * - If index i is even, arr[i] <= arr[i+1]
 * - If index i is odd, arr[i] >= arr[i+1]
 */
public class RearrangeEvenAndOdd {

    public static void main(String[] args){
        int[] arr = {6, 4, 2, 1, 8, 3};
        int[] result = rearrange(arr);
        System.out.println(Arrays.toString(result));
    }

    static int[] rearrange(int[] inputArray){

        int temp;
        for (int i = 0; i < inputArray.length - 1; i++) {
            if (i % 2 == 0 && inputArray[i] > inputArray[i + 1]) {
                temp = inputArray[i];
                inputArray[i] = inputArray[i + 1];
                inputArray[i + 1] = temp;
            }
            if (i % 2 != 0 && inputArray[i] < inputArray[i + 1]) {
                temp = inputArray[i];
                inputArray[i] = inputArray[i + 1];
                inputArray[i + 1] = temp;
            }
        }
        return inputArray;
    }
}
