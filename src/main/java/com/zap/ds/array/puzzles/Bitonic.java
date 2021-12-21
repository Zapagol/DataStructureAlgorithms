package com.zap.ds.array.puzzles;

/**
 * You are given a bitonic sequence, the task is to find Bitonic Point in it. A Bitonic Sequence is a sequence
 * of numbers which is first strictly increasing then after a point strictly decreasing.
 *
 * Input : arr[] = {6, 7, 8, 11, 9, 5, 2, 1}
 * Output: 11
 * All elements before 11 are smaller and all
 * elements after 11 are greater.
 *
 * Solutions:
 *
 *      1. Using Linear Search
 *          - Element arr[i] is bitonic point if both i-1’th and i+1’th both elements are less
 *          than i’th element.
 *
 *          - Time complexity : 0(n)
 *
 *      2. Using Binary Search
 *          - If arr[mid-1] < arr[mid] and arr[mid] > arr[mid+1] then we are done with bitonic point.
 *          - If arr[mid] < arr[mid+1] then search in right sub-array, else search in left sub-array.
 */
public class Bitonic {

    // using binary search
    static int binarySearch(int arr[], int left,
                            int right)
    {
        if (left <= right)
        {
            int mid = (left + right) / 2;

            // base condition to check if arr[mid]
            // is bitonic point or not
            if (arr[mid - 1] < arr[mid] &&
                    arr[mid] > arr[mid + 1])
                return mid;

            // We assume that sequence is bitonic. We go to
            // right subarray if middle point is part of
            // increasing subsequence. Else we go to left
            // subarray.
            if (arr[mid] < arr[mid + 1])
                return binarySearch(arr, mid + 1, right);
            else
                return binarySearch(arr, left, mid - 1);
        }

        return -1;
    }

    // Driver program
    public static void main (String[] args)
    {
        int arr[] = {6, 7, 8, 11, 9, 5, 2, 1};
        int n = arr.length;
        int index = binarySearch(arr, 1, n - 2);
        if (index != -1)
            System.out.println ( arr[index]);

    }
}
