package com.zap.al.sort;

public class BubbleSort {

   public int[] bubbleSort1(int[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length - 1; j++){
                if(arr[j] > arr[j+1]){
                    swap(arr, j);
                }
            }
        }
        return arr;
    }

    public int[] bubbleSort2(int[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length - 1 - i; j++){
                if(arr[j] > arr[j+1]){
                    swap(arr, j);
                }
            }
        }
        return arr;
    }

    public int[] bubbleSort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            int flag = 0;
            for(int j = 0; j < arr.length - 1 - i; j++){
                if(arr[j] > arr[j+1]){
                    swap(arr, j);
                    flag = 1;
                }
            }
            if(flag == 0){
                break;
            }
        }
        return arr;
    }
    private void swap(int[] arr, int j){
        int temp;

        temp = arr[j];
        arr[j] = arr[j+1];
        arr[j+1] = temp;
    }
}
