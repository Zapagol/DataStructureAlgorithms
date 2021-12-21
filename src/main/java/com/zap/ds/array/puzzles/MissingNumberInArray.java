package com.zap.ds.array.puzzles;

/**
 *  1. Find the sum of n number using formula n=n*(n+1)/2
 *      n - Number of elements in Array.
 *  2. Find the sum of elements present in given array.
 *  3. Substract (sum of n numbers – sum of elements present in the array).
 */
public class MissingNumberInArray {
    public static void main(String[] args){
        int[] intArray = {9, 7, 5, 1, 2, 6, 4, 3, 8, 12, 10};

        int numOfElements = intArray.length + 1;
        int sumNumber = numOfElements * (numOfElements + 1) / 2 ;
        int arraySum = 0;
        for(int i=0; i<intArray.length; i++){
            arraySum += intArray[i];
        }
        int missingNumber = sumNumber - arraySum;
        System.out.println("Missing Number = " + missingNumber);
    }
}
