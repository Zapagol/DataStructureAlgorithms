package com.zap.al.sort;

public class QuickSort {
    public static void main(String[] args){
        int[] arr = {7, 2, 1, 6, 8, 5, 3, 4};
//        int[] sortedArr = quickSort(arr, 0, arr.length - 1);
//        for(int i = 0; i < sortedArr.length - 1; i++){
//            System.out.print(sortedArr[i] + " ");
//        }
    }
    private int partition(int[] a, int start, int end){

        int pivot = a[end];
        int pIndex = start;

        for(int i = start; i < end; i++){
            if(a[i] <= pivot){
                swap(a, i, pIndex);
                pIndex++;
            }
        }
        swap(a, pIndex, end);
        return pIndex;
    }
    public int[] quickSort(int[] a, int start, int end){
        if(start < end){
            int pIndex = partition(a, start, end);
            quickSort(a, start, pIndex - 1);
            quickSort(a, pIndex + 1, end);
        }
        return a;
    }

    private void swap (int[] array, int x, int y)
    {
        int temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }

}
