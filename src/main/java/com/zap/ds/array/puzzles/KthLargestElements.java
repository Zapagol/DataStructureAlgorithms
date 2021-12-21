package com.zap.ds.array.puzzles;


import java.util.Arrays;
import java.util.Collections;

/**
 * Method1 : Use Sorting
 *  1) Sort the elements in descending order in O(n*log(n))
 *  2) Print the first k numbers of the sorted array O(k).
 *      Time Complexity = 0(n*log(n))
 *
 * Method2: Use MAX Heap Tree
 *  1) Build a Max Heap tree in O(n)
 *  2) Use Extract Max k times to get k maximum elements from the Max Heap O(k*log(n))
 *      Time complexity: O(n + k*log(n))
 */
public class KthLargestElements {

    //Method1 : Use sorting
    // Time Complexity = 0(n*log(n))
    public static void kLargest(Integer[] arr, int k)
    {
        // Sort the given array arr in reverse order
        // This method doesn't work with primitive data
        // types. So, instead of int, Integer type
        // array will be used
        Arrays.sort(arr, Collections.reverseOrder());

        // Print the first kth largest elements
        for (int i = 0; i < k; i++)
            System.out.print(arr[i] + " ");
    }

    //Using Max Heap
    public int findKthLargest(int[] nums, int k) {

        int n = nums.length;
        for(int i=(n/2)-1;i>=0;i--){
            maxHeapify(nums,n,i);
        }

        for(int i=n-1;i>(n-k);i--){
            swap(nums,0,i);
            maxHeapify(nums,i,0);
        }

        return nums[0];
    }

    private void maxHeapify(int[] nums,int n,int i){
        int largest = i;
        int leftchild = (2*i)+1;
        int rightchild = (2*i)+2;
        if(leftchild < n && nums[leftchild] > nums[largest]){
            largest = leftchild;
        }
        if(rightchild < n && nums[rightchild] > nums[largest]){
            largest = rightchild;
        }
        if(largest != i){
            swap(nums,largest,i);
            maxHeapify(nums,n,largest);
        }
    }

    private void swap(int[] nums,int pos1,int pos2){
        int temp = nums[pos1];
        nums[pos1] = nums[pos2];
        nums[pos2] = temp;
    }
}
