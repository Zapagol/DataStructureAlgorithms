package com.zap.ds.array.puzzles;

import java.util.Arrays;
import java.util.HashSet;

/**
 * This method uses sorting to increase the efficiency of the code.
 *
 * Approach: By Sorting the array the efficiency of the algorithm can be improved. This efficient approach
 * uses the two-pointer technique. Traverse the array and fix the first element of the triplet. Now use the Two
 * Pointers algorithm to find if there is a pair whose sum is equal to x – array[i]. Two pointers algorithm take
 * linear time so it is better than a nested loop.
 *
 * Algorithm :
 *  - Sort the given array.
 *  - Loop over the array and fix the first element of the possible triplet, arr[i].
 *  - Then fix two pointers, one at i + 1 and the other at n – 1. And look at the sum,
 *      - If the sum is smaller than the required sum, increment the first pointer.
 *      - Else, If the sum is bigger, Decrease the end pointer to reduce the sum.
 *      - Else, if the sum of elements at two-pointer is equal to given sum then print the triplet and break.
 */
public class TripletSum {

    // returns true if there is triplet with sum equal
    // to 'sum' present in A[]. Also, prints the triplet
    boolean find3Numbers1(int A[], int arr_size, int sum)
    {
        int l, r;

        /* Sort the elements */
        Arrays.sort(A);

        /* Now fix the first element one by one and find the
           other two elements */
        for (int i = 0; i < arr_size - 2; i++) {

            // To find the other two elements, start two index variables
            // from two corners of the array and move them toward each
            // other
            l = i + 1; // index of the first element in the remaining elements
            r = arr_size - 1; // index of the last element
            while (l < r) {
                if (A[i] + A[l] + A[r] == sum) {
                    System.out.print("Triplet is " + A[i] + ", " + A[l] + ", " + A[r]);
                    return true;
                }
                else if (A[i] + A[l] + A[r] < sum)
                    l++;

                else // A[i] + A[l] + A[r] > sum
                    r--;
            }
        }

        // If we reach here, then no triplet was found
        return false;
    }

    // returns true if there is triplet
    // with sum equal to 'sum' present
    // in A[]. Also, prints the triplet
    static boolean find3Numbers2(int A[],
                                int arr_size, int sum)
    {
        // Fix the first element as A[i]
        for (int i = 0; i < arr_size - 2; i++) {

            // Find pair in subarray A[i+1..n-1]
            // with sum equal to sum - A[i]
            HashSet<Integer> s = new HashSet<Integer>();
            int curr_sum = sum - A[i];
            for (int j = i + 1; j < arr_size; j++)
            {
                if (s.contains(curr_sum - A[j]))
                {
                    System.out.printf("Triplet is %d, %d, %d", A[i],
                    A[j], curr_sum - A[j]);
                    return true;
                }
                s.add(A[j]);
            }
        }

        // If we reach here, then no triplet was found
        return false;
    }

    // Driver program to test above functions
    public static void main(String[] args)
    {
        TripletSum triplet = new TripletSum();
        int A[] = { 1, 4, 45, 6, 10, 8 };
        int sum = 22;
        int arr_size = A.length;

        triplet.find3Numbers1(A, arr_size, sum);
        triplet.find3Numbers2(A, arr_size, sum);
    }
}
