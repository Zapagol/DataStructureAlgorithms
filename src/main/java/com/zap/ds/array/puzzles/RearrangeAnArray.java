package com.zap.ds.array.puzzles;

import java.util.HashSet;
import java.util.Set;

public class RearrangeAnArray {

    public static void main(String[] args){
        int[] arr = {-1, -1, 6, 1, 9, 3, 2, -1, 4, -1};
        int[] result1 = rearrangeArray1(arr);
        int[] result2 = rearrangeArray2(arr);
        for(int i = 0; i< result1.length; i++){
            System.out.print(result1[i] + " ");
        }
        System.out.println();
        for(int i = 0; i< result2.length; i++){
            System.out.print(result2[i] + " ");
        }
    }

    public static int[] rearrangeArray1(int[] arr){

        for (int i = 0; i < arr.length;) {
            if (arr[i] >= 0 && arr[i] != i) {
                int ele = arr[arr[i]];
                arr[arr[i]] = arr[i];
                arr[i] = ele;
            } else {
                i++;
            }
        }

        return arr;
    }

    /**
     * 1) Store all the numbers present in the array into a HashSet
     * 2) Iterate through the length of the array, if the corresponding position element is present
     * in the HashSet, then set A[i] = i, else A[i] = -1
     *
     * @param A
     * @return
     */
    public static int[] rearrangeArray2(int[] A)
    {
        Set<Integer> s = new HashSet<Integer>();

        // Storing all the values in the HashSet
        for(int i = 0; i < A.length; i++)
        {
            s.add(A[i]);
        }

        for(int i = 0; i < A.length; i++)
        {
            if(s.contains(i))
                A[i] = i;
            else
                A[i] = -1;
        }

        return A;
    }
}
