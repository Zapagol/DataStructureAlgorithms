package com.zap.recursion;

import java.util.Arrays;

public class ArrayTest {

    public static void main(String[] args){
        int[] arr = {1, 3, 5, 4, 6, 8};

        int iIndex = 0;

        for(int i = 0; i <= arr.length - 2; i++){
            int index2 = i+1;
            if( ((arr[i]) % 2 == 0) && !(arr[index2] % 2 == 0)){
                iIndex = index2;
            }else if (!((arr[i]) % 2 == 0) && (arr[index2] % 2 == 0)){
                swap(iIndex, index2, arr);
                iIndex++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void swap(int i, int j, int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
