package com.zap.ds.array.puzzles;

import java.util.Arrays;

/**
 * Given an unsorted array of integers, sort the array into a wave like array.
 * An array ‘arr[0..n-1]’ is sorted in wave form if arr[0] >= arr[1] <= arr[2] >= arr[3] <= arr[4] >=
 *
 * Input:  arr[] = {2, 4, 6, 8, 10, 20}
 * Output: arr[] = {4, 2, 8, 6, 20, 10} OR
 *                  any other array that is in wave form
 */
public class SortWave {

    /**
     * A Simple Solution is to use sorting. First sort the input array, then swap all adjacent elements.
     * For example, let the input array be {3, 6, 5, 10, 7, 20}. After sorting, we get {3, 5, 6, 7, 10, 20}.
     * After swapping adjacent elements, we get {5, 3, 7, 6, 20, 10}.
     *
     * @param arr
     * @param n
     */
    static void sortWave1(int[] arr, int n){
        Arrays.sort(arr);
        for(int i=0; i < n-1; i += 2){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    /**
     * The time complexity of the above solution is O(nLogn) if a O(nLogn) sorting algorithm like Merge Sort,
     * Heap Sort, .. etc is used.
     * This can be done in O(n) time by doing a single traversal of given array. The idea is based on the fact
     * that if we make sure that all even positioned (at index 0, 2, 4, ..) elements are greater than their
     * adjacent odd elements, we don’t need to worry about odd positioned element. Following are simple steps.
     * 1) Traverse all even positioned elements of input array, and do following.
     * ….a) If current element is smaller than previous odd element, swap previous and current.
     * ….b) If current element is smaller than next odd element, swap next and current.
     *
     * @param arr
     * @param n
     */
    static void sortWave2(int[] arr, int n){
        for (int i = 0; i < n; i+=2)
        {
            // If current even element is smaller
            // than previous
            if (i>0 && arr[i-1] > arr[i] )
                swap(arr, i-1, i);

            // If current even element is smaller
            // than next
            if (i<n-1 && arr[i] < arr[i+1] )
                swap(arr, i, i + 1);
        }
    }

    public static void main(String[] args){
        int[] arr = {10, 5, 6, 3, 2, 20, 100, 80};
        sortWave1(arr, arr.length);
        sortWave2(arr, arr.length);
    }
    static void swap(int arr[], int a, int b)
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
