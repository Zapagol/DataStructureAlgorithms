package com.zap.ds.array.puzzles;

import java.util.Arrays;

/**
 * Method 1 : USING TEMP ARRAY
 *      Input arr[] = [1, 2, 3, 4, 5, 6, 7], d = 2, n =7
 *          1) Store the first d elements in a temp array
 *              temp[] = [1, 2]
 *          2) Shift rest of the arr[]
 *              arr[] = [3, 4, 5, 6, 7, 6, 7]
 *          3) Store back the d elements
 *              arr[] = [3, 4, 5, 6, 7, 1, 2]
 *      - Time Complexity = 0(n)
 *      - Space Complexity = 0(d)
 * Method 2 : Rotate one by one
 *      - Time Complexity = 0(n * d)
 *      - Space Complexity = 0(1)
 *
 * Method 3:
 */
public class RotateArrayByN {

    //######################################################################//
    //  METHOD 2: Rotate 1 by 1 //
    /*Function to left rotate arr[] of size n by d*/
    void leftRotate(int arr[], int d, int n)
    {
        for (int i = 0; i < d; i++)
            leftRotatebyOne(arr, n);
    }

    void leftRotatebyOne(int arr[], int n)
    {
        int i, temp;
        temp = arr[0];
        for (i = 0; i < n - 1; i++)
            arr[i] = arr[i + 1];
        arr[n-1] = temp;
    }

    /* utility function to print an array */
    void printArray(int arr[], int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }

    // Driver program to test above functions
    public static void main(String[] args)
    {
        RotateArrayByN rotate = new RotateArrayByN();
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        rotate.leftRotate(arr, 2, 7);
        rotate.printArray(arr, 7);
    }

    //######################################################################//
    //  METHOD 3: Juggling Method //



}
