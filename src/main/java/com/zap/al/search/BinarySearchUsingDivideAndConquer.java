package com.zap.al.search;

/**
 * A binary search or half-interval search algorithm finds the position of a specified value (the input "key")
 * within a sorted array. In each step, the algorithm compares the input key value with the key value of
 * the middle element of the array. If the keys match, then a matching element has been found so its index,
 * or position, is returned. Otherwise, if the sought key is less than the middle element's key, then the
 * algorithm repeats its action on the sub-array to the left of the middle element or, if the input key
 * is greater, on the sub-array to the right. If the remaining array to be searched is reduced to zero,
 * then the key cannot be found in the array and a special "Not found" indication is returned.
 *
 * Binary search requires a sorted collection. Also, binary searching can only be applied to a
 * collection that allows random access (indexing).
 *
 * Worst case performance: O(log n)
 *
 * Best case performance: O(1)
 */
public class BinarySearchUsingDivideAndConquer {

    public int binarySearchDivideAndConquer(int value, int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = (start + end) / 2;
            if(value == arr[mid]){
                return mid;
            }
            if(value < arr[mid]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }
}
