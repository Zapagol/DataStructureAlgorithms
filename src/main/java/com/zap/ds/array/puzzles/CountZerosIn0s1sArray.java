package com.zap.ds.array.puzzles;

/**
 * Given an array of size N consisting of only 0's and 1's. The array is sorted in such a manner that
 * all the 1's are placed first and then they are followed by all the 0's. Find the count of
 * all the 0's.
 *
 * Input:
 * N = 12
 * Arr[] = {1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0}
 * Output: 3
 * Explanation: There are 3 0's in the given array.
 *
 *
 * Simple solution is to traverse the input array. As soon as we find a 0, we return n – index of first 0.
 *  Here n is number of elements in input array. Time complexity of this solution would be O(n).
 * Since the input array is sorted, we can use Binary Search to find the first occurrence of 0. Once we have
 * index of first element, we can return count as n – index of first zero.
 */
public class CountZerosIn0s1sArray {

    /* if 0 is present in arr[] then returns the index of FIRST occurrence
           of 0 in arr[low..high], otherwise returns -1 */
    int firstZero(int arr[], int low, int high)
    {
        if (high >= low)
        {
            // Check if mid element is first 0
            int mid = low + (high - low) / 2;
            if ((mid == 0 || arr[mid - 1] == 1) && arr[mid] == 0)
                return mid;

            if (arr[mid] == 1) // If mid element is not 0
                return firstZero(arr, (mid + 1), high);
            else // If mid element is 0, but not first 0
                return firstZero(arr, low, (mid - 1));
        }
        return -1;
    }

    // A wrapper over recursive function firstZero()
    int countZeroes(int arr[], int n)
    {
        // Find index of first zero in given array
        int first = firstZero(arr, 0, n - 1);

        // If 0 is not present at all, return 0
        if (first == -1)
            return 0;

        return (n - first);
    }

    // Driver program to test above functions
    public static void main(String[] args)
    {
        CountZerosIn0s1sArray count = new CountZerosIn0s1sArray();
        int arr[] = {1, 1, 1, 0, 0, 0, 0, 0};
        int n = arr.length;
        System.out.println("Count of zeroes is " + count.countZeroes(arr, n));
    }
}
