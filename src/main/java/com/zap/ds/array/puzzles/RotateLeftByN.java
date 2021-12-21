package com.zap.ds.array.puzzles;

import java.util.Arrays;

public class RotateLeftByN {

    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5};
        int [] rotatedArray = rotateLeft2(arr, 2);
        int [] result2 = rotateLeft2(arr, 2);

        //Arrays.stream(rotatedArray).forEach(System.out::println);
        System.out.println(Arrays.toString(result2));

    }

    static int[] rotateLeft1(int[] arr, int n){

        for(int i = 0; i < n; i++){
            int first = arr[0];
            int j;

            for (j = 0; j < arr.length - 1; j++){
                arr[j] = arr[j+1];
            }
            arr[j] = first;
        }
        return arr;
    }
    static int[] leftRotate(int arr[], int d, int n)
    {
        /* To handle if d >= n */
        d = d % n;
        int i, j, k, temp;
        int g_c_d = gcd(d, n);
        for (i = 0; i < g_c_d; i++) {
            /* move i-th values of blocks */
            temp = arr[i];
            j = i;
            while (true) {
                k = j + d;
                if (k >= n)
                    k = k - n;
                if (k == i)
                    break;
                arr[j] = arr[k];
                j = k;
            }
            arr[j] = temp;
        }
        return arr;
    }
    /*Fuction to get gcd of a and b*/
    static int gcd(int a, int b)
    {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }

    static int[] rotateLeft2(int[] arr, int n){

        int[] tempArray = new int[n];
        int[] newArray = new int[arr.length];
        for(int i = 0; i < n; i++){
            tempArray[i] = arr[i];
        }
        int ind = 0;
        for(int j = n; j < arr.length; j++){
            newArray[ind] = arr[j];
            ++ind;
        }
        for(int k = newArray.length -1; k >= n; k--){
            int temp = newArray.length - 1;
            newArray[temp] = arr[k];
            temp++;
        }

        return newArray;

        
    }
}
