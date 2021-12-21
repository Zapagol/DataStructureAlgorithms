package com.zap.practice;

/**
 * Count minimum number of fountains to be activated to cover the entire garden.
 * - There is a one-dimensional garden of length N.
 * - In each position of the N length garden,a fountain has been installed.
 * - Given an array a[]such that a[i] describes the coverage limit of ith fountain.
 * - A fountain can cover the range from the position max(i – a[i], 1) to min(i + a[i], N).
 * - In beginning, all the fountains are switched off. The task is to find the minimum number of fountains
 * needed to be activated such that the whole N-length garden can be covered by water.
 */
public class MinimumNumberFountains {
    public static int minTaps(int[] ranges, int n){
        int min = 0, max = 0, open = 0;
        while (max < n){
            for(int i = 0; i < ranges.length; i++){
                if(i - ranges[i] <= min && i + ranges[i] > max){
                    max = i + ranges[i];
                }
            }
            open++;
            min = max;
        }
        return open;
    }

    public static void main(String[] args){
        //int[] a = {2, 1, 1, 2, 1};
        int[] a = {1, 2, 1};
        System.out.println(minTaps(a, a.length));
    }

}
