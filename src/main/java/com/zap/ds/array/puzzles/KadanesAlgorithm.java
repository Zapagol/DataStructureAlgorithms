package com.zap.ds.array.puzzles;

/**
 *
 * Problem :
 *      Given an array, the algorithm to find the maximum subarray sum is called Kadane’s Algorithm.
 *
 * Steps :
 *
 * Initialize:
 *     max_so_far = 0
 *     max_ending_here = 0
 *
 * Loop for each element of the array
 *   (a) max_ending_here = max_ending_here + a[i]
 *   (b) if(max_so_far < max_ending_here)
 *             max_so_far = max_ending_here
 *   (c) if(max_ending_here < 0)
 *             max_ending_here = 0
 * return max_so_far
 */
public class KadanesAlgorithm {

    public static void main(String[] args){
        int[] arr1 = {-2, -3, 4, -1, -2, 1, 5, -3};
        int[] arr2 = {-2, -3, -1, -2};
        System.out.println(largsetSumContArray1(arr1));
        System.out.println(largsetSumContArray1(arr2));
        System.out.println(largsetSumContArray2(arr1));
        System.out.println(largsetSumContArray2(arr2));
    }

    static int largsetSumContArray1(int[] a){
        int size = a.length;
        int max_so_far = Integer.MIN_VALUE;
        int max_ending_here = 0;

        for (int i = 0; i < size; i++)
        {
            max_ending_here = max_ending_here + a[i];
            if(max_ending_here < a[i])
                max_ending_here = a[i];
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    static int largsetSumContArray2(int a[])
    {
        int max_so_far = a[0];
        int curr_max = a[0];

        for (int i = 1; i < a.length; i++)
        {
            curr_max = Math.max(a[i], curr_max+a[i]);
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }
}
