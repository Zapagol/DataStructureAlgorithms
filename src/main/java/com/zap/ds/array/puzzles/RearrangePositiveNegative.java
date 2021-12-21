package com.zap.ds.array.puzzles;

import java.util.Arrays;

public class RearrangePositiveNegative {

    public static void main(String[] args){
        int[] arr = {12, 11, -13, -5, 6, -7, 5};
        int[] result = rearrange(arr);
        System.out.println(Arrays.toString(result));
    }

    static int[] rearrange(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        for(int i = 0; i < end - 1; i++){
            if(arr[i] >= 0){
                if(arr[i] >= arr[end]){
                    swap(arr, i, end);
                }
            }else {
                if (arr[i] <= arr[start]){
                    swap(arr, start, i);
                    start++;
                }
            }
        }
        return arr;
    }

    private static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
