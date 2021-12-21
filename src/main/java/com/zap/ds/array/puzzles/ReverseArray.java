package com.zap.ds.array.puzzles;

import java.util.Arrays;

/**
 * 1) Initialize start and end indexes as start = 0, end = n-1
 * 2) In a loop, swap arr[start] with arr[end] and change start and end as follows :
 * start = start +1, end = end – 1
 */
public class ReverseArray {

    public static void main(String[] args){
        int[] inputArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] result = reverseArray(inputArr);

        System.out.println(Arrays.toString(result));
    }

    public static int[] reverseArray(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while (start < end){
            swap(arr, start, end);
            start++;
            end--;
        }
        return arr;
    }
    private static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
