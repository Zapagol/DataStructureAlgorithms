package com.zap.ds.array.puzzles;

/**
 * Method1:
 * Time Complexity: O(n).
 *      Only one traversal of the array is needed.
 * Space Complexity: O(1).
 *      No extra space is required.
 * Approach: Count the number of 0s, 1s and 2s in the given array. Then store all the 0s in the beginning
 * followed by all the 1s then all the 2s.
 * Algorithm:
 *      - Keep three counter c0 to count 0s, c1 to count 1s and c2 to count 2s
 *      - Traverse through the array and increase the count of c0 if the element is 0,increase the count of
 *      c1 if the element is 1 and increase the count of c2 if the element is 2
 *      - Now again traverse the array and replace first c0 elements with 0, next c1 elements with 1 and
 *      next c2 elements with 2.
 */
public class SortArrayOf0s1s2s {

    /**
     * Method 2:
     *      - Keep three indices low = 0, mid = 0 and high = N - 1 and there are four ranges,
     *      - Traverse the array from start to end and mid is less than high. (Loop counter is i)
     *      - If the element is 0 then swap the element with the element at index low and mid.
     *      update low = low + 1 and mid = mid + 1
     *      - If the element is 1 then update mid = mid + 1
     *      - If the element is 2 then swap the element with the element at index high and mid.
     *      update high = high – 1.
     *
     * @param arr
     * @param n
     */

    static void sort012(int[] arr, int n){
        int l = 0;
        int m = 0;
        int h = n - 1;
        while(m <= h){
            if(arr[m] == 0){
                swap(arr, l, m);
                l++;
                m++;
            }else if(arr[m] == 1){
                m++;
            }else if(arr[m] == 2){
                swap(arr, m, h);
                h--;
            }
        }
        printArr(arr, n);
    }

    static void swap(int[] arr, int l, int m){
        int temp = arr[l];
        arr[l] = arr[m];
        arr[m] = temp;
    }

    // Utility function to print the contents of an array
    static void printArr(int arr[], int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }

    // Function to sort the array of 0s, 1s and 2s
    static void sortArr(int arr[], int n)
    {
        int i, cnt0 = 0, cnt1 = 0, cnt2 = 0;

        // Count the number of 0s, 1s and 2s in the array
        for (i = 0; i < n; i++) {
            switch (arr[i]) {
                case 0:
                    cnt0++;
                    break;
                case 1:
                    cnt1++;
                    break;
                case 2:
                    cnt2++;
                    break;
            }
        }

        // Update the array
        i = 0;

        // Store all the 0s in the beginning
        while (cnt0 > 0) {
            arr[i++] = 0;
            cnt0--;
        }

        // Then all the 1s
        while (cnt1 > 0) {
            arr[i++] = 1;
            cnt1--;
        }

        // Finally all the 2s
        while (cnt2 > 0) {
            arr[i++] = 2;
            cnt2--;
        }

        // Print the sorted array
        printArr(arr, n);
    }

    // Driver code
    public static void main(String[] args)
    {
        int arr[] = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
        int n = arr.length;
        sort012(arr, n);
    }
}
