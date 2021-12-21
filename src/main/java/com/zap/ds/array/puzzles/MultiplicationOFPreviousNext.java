package com.zap.ds.array.puzzles;

import java.util.Arrays;

/**
 * Replace every array element by multiplication of previous and next.
 *
 * Given an array of integers, update every element with multiplication of previous and next elements with
 * following exceptions.
 * a) First element is replaced by multiplication of first and second.
 * b) Last element is replaced by multiplication of last and second last.
 */
public class MultiplicationOFPreviousNext {

    public static void main(String[] args){
        int[] arr = {2, 3, 4, 5, 6};
        int[] result = multiply(arr, arr.length);
        System.out.println(Arrays.toString(result));
    }
    public static int[] multiply(int[] arr, int length){

        // store prev element
        int prev = arr[0];
        // Replace 1st element
        arr[0] = arr[0] * arr[1];

        // Replace remaining element
        for(int  i = 1; i < length - 1; i++){
            // Store current element
            int curr = arr[i];
            arr[i] = prev * arr[i + 1];
            // update prev element
            prev = curr;
        }

        // Replace last element
        arr[length - 1] = prev * arr[length - 1];

        return arr;
    }
}
