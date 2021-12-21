package com.zap.ds.array.puzzles;

import java.util.Arrays;
import java.util.HashMap;

/**
 *Given an array A of N elements. Find the majority element in the array. A majority element in an array
 * A of size N is an element that appears more than N/2 times in the array.
 *
 * Example 1:
 *      Input:
 *          N = 3
 *          A[] = {1,2,3}
 *      Output:
 *          -1
 *      Explanation:
 *          Since, each element in
 *          {1,2,3} appears only once so there
 *          is no majority element.
 *
 * Example 2:
 *      Input:
 *          N = 5
 *          A[] = {3,1,3,3,2}
 *      Output:
 *          3
 *      Explanation:
 *          Since, 3 is present more
 *          than N/2 times, so it is
 *          the majority element.
 */
public class MajorityElement {

    /**
     * Solution 1
     *      Approach: The basic solution is to have two loops and keep track of the maximum count for all
     *      different elements. If maximum count becomes greater than n/2 then break the loops and return the
     *      element having maximum count. If the maximum count doesn’t become more than n/2 then the majority
     *      element doesn’t exist.
     * Algorithm:
     *      - Create a variable to store the max count, count = 0
     *      - Traverse through the array from start to end.
     *      - For every element in the array run another loop to find the count of similar elements in the given
     *      array.
     *      - If the count is greater than the max count update the max count and store the index in another
     *      variable.
     *      - If the maximum count is greater than the half the size of the array, print the element. Else print
     *      there is no majority element.
     *
     * Complexity Analysis:
     *
     *  Time Complexity: O(n*n).
     *      A nested loop is needed where both the loops traverse the array from start to end, so the time complexity is O(n^2).
     *  Auxiliary Space: O(1).
     *      As no extra space is required for any operation so the space complexity is constant.
     * @param arr
     * @param n
     */
    // Function to find Majority element
    // in an array
    static void findMajority1(int arr[], int n){
        int maxCount = 0;
        int index = -1; // sentinels
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j])
                    count++;
            }

            // update maxCount if count of
            // current element is greater
            if (count > maxCount) {
                maxCount = count;
                index = i;
            }
        }

        // if maxCount is greater than n/2
        // return the corresponding element
        if (maxCount > n / 2)
            System.out.println(arr[index]);

        else
            System.out.println("No Majority Element");
    }

    /**
     * Solution 2: Using HashMap
     *  Approach: This method is somewhat similar to Moore voting algorithm in terms of time complexity, but in
     *      this case, there is no need for the second step of Moore voting algorithm. But as usual, here space
     *      complexity becomes O(n).
     *      In Hashmap(key-value pair), at value, maintain a count for each element(key) and whenever the count
     *      is greater than half of the array length, return that key(majority element).
     *
     * Algorithm:
     *      - Create a hashmap to store a key-value pair, i.e. element-frequency pair.
     *      - Traverse the array from start to end.
     *      - For every element in the array, insert the element in the hashmap if the element does not exist as
     *      key, else fetch the value of the key ( array[i] ), and increase the value by 1
     *      - If the count is greater than half then print the majority element and break.
     *      - If no majority element is found print “No Majority element”
     *
     * Complexity Analysis:
     *
     *  Time Complexity: O(n).
     *      One traversal of the array is needed, so the time complexity is linear.
     *  Auxiliary Space: O(n).
     *      Since a hashmap requires linear space.
     * @param arr
     */
    private static void findMajority2(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                int count = map.get(arr[i]) +1;
                if (count > arr.length /2) {
                    System.out.println("Majority found :- " + arr[i]);
                    return;
                } else
                    map.put(arr[i], count);

            }
            else
                map.put(arr[i],1);
        }
        System.out.println(" No Majority element");
    }

    /**
     * Solution 3: Sorting
     *
     * Approach: The idea is to sort the array. Sorting makes similar elements in the array adjacent, so
     *  traverse the array and update the count until the present element is similar to the previous one.
     *  If the frequency is more than half the size of the array, print the majority element.
     * Algorithm:
     *      - Sort the array and create a variable count and previous, prev = INT_MIN.
     *      - Traverse the element from start to end.
     *      - If the current element is equal to the previous element increase the count.
     *      - Else set the count to 1.
     *      - If the count is greater than half the size of array, print the element as majority element and break.
     *      - If no majority element found, print “No majority element”
     *
     * Complexity Analysis:
     *
     *  Time Complexity: O(nlogn).
     *      Sorting requires O(n log n) time complexity.
     *  Auxiliary Space: O(1).
     *      As no extra space is required.
     * @param arr
     * @param n
     * @return
     */
    public static int findMajority3(int[] arr, int n)
    {

        // Sort the array in O(nlogn)
        Arrays.sort(arr);

        int count = 1, max_ele = -1,
                temp = arr[0], ele = 0,
                f = 0;

        for(int i = 1; i < n; i++)
        {

            // Increases the count if the
            // same element occurs otherwise
            // starts counting new element
            if (temp == arr[i])
            {
                count++;
            }
            else
            {
                count = 1;
                temp = arr[i];
            }

            // Sets maximum count and stores
            // maximum occurred element so far
            // if maximum count becomes greater
            // than n/2 it breaks out setting
            // the flag
            if (max_ele < count)
            {
                max_ele = count;
                ele = arr[i];

                if (max_ele > (n / 2))
                {
                    f = 1;
                    break;
                }
            }
        }

        // Returns maximum occurred element
        // if there is no such element, returns -1
        return (f == 1 ? ele : -1);
    }
}
