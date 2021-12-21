package com.zap.ds.array.puzzles;

import java.util.Arrays;
import java.util.Collections;

public class SegragateEvenAndOddNumbers {

    public static void main(String[] args){
        Integer[] arr = {1, 2, 3, 4, 5, 6, 10, 12, 11};

        int index = 0;
        for (int i = 0; i < arr.length; i++){
            if(arr[i] % 2 != 0){
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
                index++;
            }
        }

        // Sort odd number in descending order
        //Arrays.sort(arr, 0, index, Collections.reverseOrder());

        // Sort even number in ascending order
        //Arrays.sort(arr, index, arr.length);

        System.out.println(Arrays.toString(arr));
    }

    private static int[] segragateNumbers(int[] arr){

        int index = 0;
        for (int i = 0; i < arr.length; i++){
            if(arr[i] % 2 != 0){
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
                index++;
            }
        }
        return arr;
    }

    public static void arrangeOddAndEven(int arr[], int n)
    {
        int oddInd = 1;
        int evenInd = 0;
        while (true)
        {
            while (evenInd < n && arr[evenInd] % 2 == 0)
                evenInd += 2;

            while (oddInd < n && arr[oddInd] % 2 == 1)
                oddInd += 2;

            if (evenInd < n && oddInd < n)
            {
                int temp = arr[evenInd];
                arr[evenInd] = arr[oddInd];
                arr[oddInd] = temp;
                evenInd += 2;
                oddInd += 2;
            }

            else
                break;
        }
    }


}
