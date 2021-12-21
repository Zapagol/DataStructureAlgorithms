package com.zap.al.sort;

import java.util.Arrays;

/**
 * Steps for heap sort
 *  - Represent array as complete binary tree.
 *      1. Left child will be at 2*i+1 th location
 *      2. Right child will be at 2*i+2 th location.
 *  - Build a heap.
 *      1. All the leaf nodes already satisfy heap property, so we don’t need to heapify them.
 *      2. Last leaf node will be present at (n-1)th location, so parent of it will be at (n-1)/2 th location,
 *      hence (n-1)/2 will be location of last non leaf node.
 *      3. Iterate over non leaf nodes and heapify the elements.
 *  - After building a heap, max element will be at root of the heap. We will exchange it with (n-1)th location, so
 *  largest element will be at proper place and remove it from the heap by reducing size of n.
 *  - When you exchange largest element, it may disturb max heap property, so you need to again heapify it.
 *  - Once you do above steps until no elements left in heap, you will get sorted array in the end.
 *
 *  Algorithm
 *      - Build heap using given elements
 *      - We create max heap to sort elements in ascending order
 *      - Once the heap is created we swap the root node with last node and delete the
 *      last node from the heap
 */
public class HeapSort {

    public void sort(int arr[]){

        int n = arr.length;

        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        // One by one extract an element from heap
        for (int i = n - 1; i > 0; i--) {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // call max heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }

    // To heapify a subtree rooted with node i which is
    // an index in arr[]. n is size of heap
    void heapify(int arr[], int n, int i)
    {
        int largest = i; // Initialize largest as root
        int l = 2 * i + 1; // left = 2*i + 1
        int r = 2 * i + 2; // right = 2*i + 2

        // If left child is larger than root
        if (l < n && arr[l] > arr[largest])
            largest = l;

        // If right child is larger than largest so far
        if (r < n && arr[r] > arr[largest])
            largest = r;

        // If largest is not root
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }
    }

    /* A utility function to print array of size n */
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Driver code
    public static void main(String args[])
    {
        int arr[] = { 12, 11, 13, 5, 6, 7 };

        HeapSort ob = new HeapSort();
        ob.sort(arr);

        System.out.println("Sorted array is");
        printArray(arr);
    }

}
