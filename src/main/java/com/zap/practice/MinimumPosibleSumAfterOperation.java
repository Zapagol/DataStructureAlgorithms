package com.zap.practice;

/**
 * Problem :
 *  Minimum possible sum of array elements after performing the given operation
 *
 * - Given an array arr[] of positive integers and an integer x,
 * the task is to minimize the sum of elements of the array after performing the given operation at most once.
 * In a single operation, any element from the array can be divided by x (if it is divisible by x)
 * and at the same time, any other element from the array must be multiplied by x.
 *
 * -  For an optimal solution, x must be multiplied with the smallest element from the array and only
 * the largest element divisible by x must be divided by it.
 *
 */
public class MinimumPosibleSumAfterOperation {

    public static int minimumSum(int[] a, int n, int x){
        //Array sum without any operation;
        int sum = 0;

        //Find largest number divisible by x
        int largestDivisibleNumber = -1;

        //Find minimum number to multiply by x
        int minimum = a[0];

        for(int i = 0; i < n; i++){
            //It calculates sum of the array without any operation
            sum += a[i];

            //This is to find largest divisible number
            if(a[i] % x == 0 && a[i] > largestDivisibleNumber) largestDivisibleNumber = a[i];
            // This is to find minimum element in array
            if(a[i] < minimum) minimum = a[i];
        }
        if(largestDivisibleNumber == -1) return sum;
        int sumAfterOperation = sum - minimum - largestDivisibleNumber + (x * minimum) + (x / largestDivisibleNumber);

        return Math.min(sum, sumAfterOperation);
    }

    public static void main(String[] args){
        //int arr[] = { 5, 5, 5, 5, 6 };
        int arr[] = { 1, 2, 3, 4, 5};
        int n =arr.length;
        //int x = 3;
        int x = 2;
        System.out.println(minimumSum(arr, n, x));
    }
}
