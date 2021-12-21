package com.zap.ds.stack.puzzles;

import java.util.Stack;

public class NextGreaterElement {

    static void printNGE(int arr[], int n){
        Stack<Integer> s = new Stack<>();

        int arr1[] = new int[n];

        // iterating from n-1 to 0
        for (int i = n - 1; i >= 0; i--)
        {
        /*We will pop till we get the
        greater element on top or stack gets empty*/
            while (!s.isEmpty() && s.peek() <= arr[i])
                s.pop();

        /*if stack gets empty means there
        is no element on right which is greater
        than the current element.
        if not empty then the next greater
        element is on top of stack*/
            if (s.empty())
                arr1[i] = -1;
            else
                arr1[i] = s.peek();

            s.push(arr[i]);
        }

        for (int i = 0; i < n; i++)
            System.out.println(arr[i] + " ---> " + arr1[i]);
    }

    /* Driver program to test above functions */
    public static void main(String[] args)
    {
        int arr[] = { 4, 5, 2, 25 };
        int n = arr.length;
        printNGE(arr, n);
    }
}
