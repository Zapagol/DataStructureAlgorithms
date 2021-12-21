package com.zap.al.sort;

public class MergeSort extends DisplayArray{

    public int[] mergeSort(int[] arr, int n){

        if(n < 2){
            return arr;
        }
        int mid = n/2;
        int[] l = new int[mid];
        int[] r = new int[n-mid];
        for(int i = 0; i < mid; i++){
            l[i] = arr[i];
        }
        for(int j = mid; j < n; j++){
            r[j - mid] = arr[j];
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);
        int[] sortedArray = merge(arr, l, r, mid, n - mid);

        return sortedArray;
    }

    private int[] merge(int[] a, int[] l, int[] r, int ln, int rn){

        int i = 0, j = 0, k = 0;

        while(i < ln && j < rn){
            if(l[i] <= r[j]){
                a[k++] = l[i++];
            }else{
                a[k++] = r[j++];
            }
        }
        while(i < ln){
            a[k++] = l[i++];
        }
        while(j < rn){
            a[k++] = r[j++];
        }
        return a;
    }
}
