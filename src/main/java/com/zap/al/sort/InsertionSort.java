package com.zap.al.sort;

public class InsertionSort extends DisplayArray{

    public int[] insertionSort(int[] arr, int n){
        for (int i = 1; i < n; i++) {
            int value = arr[i];
            int hole = i;
            while(hole > 0 && arr[hole - 1] > value){
                arr[hole] = arr[hole-1];
                hole--;
            }
            arr[hole] = value;
        }
        return arr;
    }
}
