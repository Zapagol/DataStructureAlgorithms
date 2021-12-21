package com.zap.ds.array.puzzles;

/**
 * Given two arrays, the task is to calculate the product of max element of first array and min
 * element of second array
 *
 * Approach 1:
 *  - Naive approach We first sort both arrays. Then we easily find max in first array and min in second array.
 *  - Finally, we return product of min and max.
 *
 *  Complexity
 *      - nlogn
 *
 *  Approach 2:
 *      - Efficient approach In this approach, we simply traverse the whole arrays and find max in first array
 *      and min in second array and can easily get product of min and max.
 */
public class MaxMinProduct {

    // Function to calculate the product
    public static int minMaxProduct(int arr1[],
                                    int arr2[],
                                    int n1,
                                    int n2)
    {

        // Initialize max of
        // first array
        int max = arr1[0];

        // initialize min of
        // second array
        int min = arr2[0];

        int i;
        for (i = 1; i < n1 && i < n2; ++i)
        {

            // To find the maximum
            // element in first array
            if (arr1[i] > max)
                max = arr1[i];

            // To find the minimum element
            // in second array
            if (arr2[i] < min)
                min = arr2[i];
        }

        // Process remaining elements
        while (i < n1)
        {
            if (arr1[i] > max)
                max = arr1[i];
            i++;
        }
        while (i < n2)
        {
            if (arr2[i] < min)
                min = arr2[i];
            i++;
        }

        return max * min;
    }

    // Driver Code
    public static void main(String argc[])
    {
        int [] arr1= new int []{ 10, 2, 3,
                6, 4, 1 };
        int [] arr2 = new int []{ 5, 1, 4,
                2, 6, 9 };
        int n1 = 6;
        int n2 = 6;
        System.out.println(minMaxProduct(arr1, arr2,
                n1, n2));
    }

}
