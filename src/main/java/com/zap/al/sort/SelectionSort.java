package com.zap.al.sort;

public class SelectionSort {

    public int[] selectionSort(int[] arr){

        int n = arr.length;
        for(int i = 0; i < n - 1; i++){ // We need to do n-2 passes
            int iMin = i; // ith position : elements from i till n-1 are candidates
            for(int j = i + 1; j < n; j++){
                if(arr[j] < arr[iMin]){
                    iMin = j; // update the index of minimum element
                }
            }
            int temp = arr[i];
            arr[i] = arr[iMin];
            arr[iMin] = temp;
        }
        return arr;
    }
}
