package com.zap.ds.array.puzzles;

import java.util.Arrays;

/**
 * Method1:
 *  - A Simple Solution is to first sort the array. After sorting, exclude the first element, swap the
 *  remaining elements in pairs. (i.e. keep arr[0] as it is, swap arr[1] and arr[2], swap arr[3] and arr[4],
 *  and so on).
 *      Time complexity: O(N log N) since we need to sort the array first.
 *
 * Method2:
 *  - We can convert in O(n) time using an efficient approach. The idea is to use a modified one pass
 *  of bubble sort.
 *
 *      - Maintain a flag for representing which order(i.e. < or >) currently we need.
 *      - If the current two elements are not in that order then swap those elements otherwise not.
 */
public class ZigZagArray {

    static int arr[] = new int[]{4, 3, 7, 8, 6, 2, 1};

    // Method for zig-zag conversion of array
    static void zigZag()
    {
        // Flag true indicates relation "<" is expected,
        // else ">" is expected. The first expected relation
        // is "<"
        boolean flag = true;

        int temp =0;

        for (int i=0; i<=arr.length-2; i++)
        {
            if (flag) /* "<" relation expected */
            {
                /* If we have a situation like A > B > C,
                we get A > B < C by swapping B and C */
                if (arr[i] > arr[i+1])
                {
                    // swap
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }

            }
            else /* ">" relation expected */
            {
                /* If we have a situation like A < B < C,
                we get A < C > B by swapping B and C */
                if (arr[i] < arr[i+1])
                {
                    // swap
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
            flag = !flag; /* flip flag */
        }
    }

    // Driver method to test the above function
    public static void main(String[] args)
    {
        zigZag();
        System.out.println(Arrays.toString(arr));
    }
}
