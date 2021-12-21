package com.zap.ds.array.puzzles;

import java.util.Arrays;

public class MoveAllZeroesToEnd {

    public static void main(String[] args){
        int[] inputArr = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
        int arr[] = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
        int[] result1 = moveAllZeroesToEnd(inputArr);
        int[] result2 = pushZerosToEnd(arr, arr.length);
        System.out.println(Arrays.toString(result1));
        System.out.println(Arrays.toString(result2));
    }

    /**
     * 1) Initialize start and end indexes as start = 0, end = n-1
     * 2) If Start equal to 0 and if end is 0 then decrement until end is not equal to 0
     * 3) Using updated end pointer swap start and end value in the array
     * @param arr
     * @return
     */
    static int[] moveAllZeroesToEnd(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while (start < end){
            if(arr[start] == 0){
                if(arr[end] == 0){
                    end --;
                }else{
                    swap(arr, start, end);
                    start++;
                    end--;
                }
            }else {
                start++;
            }
        }
        return arr;
    }

    // Function which pushes all zeros to end of an array.
    static int[] pushZerosToEnd(int arr[], int n) {
        int count = 0;  // Count of non-zero elements

        // Traverse the array. If element encountered is
        // non-zero, then replace the element at index 'count'
        // with this element
        for (int i = 0; i < n; i++)
            if (arr[i] != 0)
                arr[count++] = arr[i]; // here count is incremented
        // Now all non-zero elements have been shifted to
        // front and 'count' is set as index of first 0.
        // Make all elements 0 from count to end.
        //System.out.println(Arrays.toString(arr));
        while (count < n)
            arr[count++] = 0;


        return arr;
    }
    private static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
