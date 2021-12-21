package com.zap.al.search;

public class BinarySearchUsingRecursive {

    public int binarySearchWithRecursive(int arr[], int start, int end, int key){
        if (start <= end){
            int mid = start + (end - start)/2;
            if (arr[mid] == key){
                return mid;
            }
            if (arr[mid] > key){
                return binarySearchWithRecursive(arr, start, mid-1, key);//search in left subarray
            }else{
                return binarySearchWithRecursive(arr, mid+1, end, key);//search in right subarray
            }
        }
        return -1;
    }
}
