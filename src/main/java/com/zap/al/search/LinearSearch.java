package com.zap.al.search;

/**
 * Linear search or sequential search is a method for finding a particular value in a list,
 * that consists of checking every one of its elements, one at a time and in sequence, until
 * the desired one is found.
 *
 *Algorithm:
 *
 *  Step 1: Traverse the array
 *  Step 2: Match the key element with array element
 *  Step 3: If key element is found, return the index position of the array element
 *  Step 4: If key element is not found, return -1
 */
public class LinearSearch {

    public int linearSearch(int value, int[] inputArr){
        for(int i = 0; i < inputArr.length; i++){
            if(inputArr[i] == value) return i;
        }
        return -1;
    }
}
