package com.zap.ds.array.puzzles;

import java.util.Arrays;

public class DoubleFirstElmtAndMoveZeroEnd {

    public static void main(String[] args)
    {
        int arr[] = { 0, 2, 2, 2, 0, 6, 6, 0, 0, 8 };
        int n = arr.length;

        modifyAndRearrangeArr(arr, n);
    }

    static void modifyAndRearrangeArr(int arr[], int n)
    {
        // if 'arr[]' contains a single element
        // only
        if (n == 1)
            return;

        // traverse the array
        for (int i = 0; i < n - 1; i++) {

            // if true, perform the required modification
            if ((arr[i] != 0) && (arr[i] == arr[i + 1]))
            {

                // double current index value
                arr[i] = 2 * arr[i];

                // put 0 in the next index
                arr[i + 1] = 0;

                // increment by 1 so as to move two
                // indexes ahead during loop iteration
                i++;
            }
        }

        // push all the zeros at
        // the end of 'arr[]'
        pushZerosToEnd(arr, n);
    }

    // function which pushes all
    // zeros to end of an array.
    static void pushZerosToEnd(int arr[], int n)
    {
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
        System.out.println(Arrays.toString(arr));
    }
    private static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
