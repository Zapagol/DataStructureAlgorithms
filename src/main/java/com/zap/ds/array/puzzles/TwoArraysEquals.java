package com.zap.ds.array.puzzles;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoArraysEquals {

    /**
     * Method1:
     *      - A simple solution is to sort both arrays and then linearly compare elements.
     *      Time Complexity: 0(nlogn)
     *      Space: 0(1)
     *
     * @param A
     * @param B
     * @param N
     * @return
     */
    public static boolean check(long A[],long B[],int N)
    {
        //Your code here
        Arrays.sort(A);
        Arrays.sort(B);
        for(int i = 0; i < N; i++){
            if(A[i] != B[i]) return false;
        }
        return true;
    }

    /**
     * An Efficient Solution to this approach is to use hashing.
     *  - We store all elements of arr1[] and their counts in a hash table.
     *  - Then we traverse arr2[] and check if the count of every element
     * in arr2[] matches with the count in arr1[].
     *
     * @param arr1
     * @param arr2
     * @return
     */
    public static boolean areEqual(int arr1[], int arr2[])
    {
        int n = arr1.length;
        int m = arr2.length;

        // If lengths of arrays are not equal
        if (n != m)
            return false;

        // Store arr1[] elements and their counts in
        // hash map
        Map<Integer, Integer> map
                = new HashMap<>();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (map.get(arr1[i]) == null)
                map.put(arr1[i], 1);
            else {
                count = map.get(arr1[i]);
                count++;
                map.put(arr1[i], count);
            }
        }

        // Traverse arr2[] elements and check if all
        // elements of arr2[] are present same number
        // of times or not.
        for (int i = 0; i < n; i++) {
            // If there is an element in arr2[], but
            // not in arr1[]
            if (!map.containsKey(arr2[i]))
                return false;

            // If an element of arr2[] appears more
            // times than it appears in arr1[]
            if (map.get(arr2[i]) == 0)
                return false;

            count = map.get(arr2[i]);
            --count;
            map.put(arr2[i], count);
        }

        return true;
    }

    // Driver code
    public static void main(String[] args)
    {
        int arr1[] = { 3, 5, 2, 5, 2 };
        int arr2[] = { 2, 3, 5, 5, 2 };

        if (areEqual(arr1, arr2))
            System.out.println("Yes");
        else
            System.out.println("No");
    }

}
