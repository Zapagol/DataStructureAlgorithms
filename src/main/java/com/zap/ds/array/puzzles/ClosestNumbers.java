package com.zap.ds.array.puzzles;

import java.util.*;

public class ClosestNumbers {

    static int[] closetNumbers(int[] arr){
        Arrays.sort(arr);
        Map<Integer, List<Integer>> map = new HashMap<>();
        int minDifference = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length - 1; i++){
            int currentDiff = arr[i+1] - arr[i];
            if(minDifference >= currentDiff){
                if (map.containsKey(currentDiff)){
                    map.get(currentDiff).add(arr[i]);
                    map.get(currentDiff).add(arr[i+1]);
                }else {
                    List<Integer> list = new ArrayList<>();
                    list.add(arr[i]);
                    list.add(arr[i+1]);
                    map.put(currentDiff, list);
                }
            }
            minDifference = currentDiff;
        }
        List<Integer> minDifferenceElements = map.get(minDifference);
        int[] result = new int[minDifferenceElements.size()];
        for(int i = 0; i < result.length; i++){
            result[i] = minDifferenceElements.get(i);
        }
        return result;
    }

    public static void main(String[] args){
        int[] arr1 = {5, 4, 3, 2};
        int[] result1 = closetNumbers(arr1); // [2, 3, 3, 4, 4, 5]
        System.out.println(Arrays.toString(result1));

        int[] arr2 = {5, 4, 3, 2};
        int[] result2 = closetNumbers(arr2); // [2, 3, 3, 4, 4, 5]
        System.out.println(Arrays.toString(result2));
    }
}
