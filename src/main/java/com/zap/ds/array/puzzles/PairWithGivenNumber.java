package com.zap.ds.array.puzzles;

import java.util.HashSet;
import java.util.Set;

public class PairWithGivenNumber {

    public static void main(String[] args){
        int[] input = {1, 2, 3, 4, 5, 6, 7};
//        boolean result = pairWithGivenNumber(input, 9);
//        if(result) System.out.println("Pair exists in array");
//        else System.out.println("Pair does not exists in array");

        printpairs(input, 11);
        pairWithGivenNumber(input, 11);
    }

    static boolean pairWithGivenNumber(int[] arr, int n){
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            if(arr[start] + arr[end] == n) return true;
            else if(arr[start] + arr[end] > n) end--;
            else start++;
        }
        return false;
    }
    static void printpairs(int arr[], int sum)
    {
        Set<Integer> s = new HashSet<>();
        for (int i = 0; i < arr.length; ++i) {
            int temp = sum - arr[i];

            // checking for condition
            if (s.contains(temp)) {
                System.out.println(
                        "Pair with given sum "
                                + sum + " is (" + arr[i]
                                + ", " + temp + ")");
            }
            s.add(arr[i]);
        }
    }
    // Naive method to find a pair in an array with a given sum
    static void findPair(int[] A, int sum)
    {
        // consider each element except the last
        for (int i = 0; i < A.length - 1; i++)
        {
            // start from the i'th element until the last element
            for (int j = i + 1; j < A.length; j++)
            {
                // if the desired sum is found, print it
                if (A[i] + A[j] == sum)
                {
                    System.out.println("Pair found (" + A[i] + ", " + A[j] + ")");
                    return;
                }
            }
        }

        // we reach here if the pair is not found
        System.out.println("Pair not found");
    }

}
