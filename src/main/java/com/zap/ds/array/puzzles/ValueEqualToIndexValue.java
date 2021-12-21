package com.zap.ds.array.puzzles;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an array Arr of N positive integers. Your task is to find the elements whose value is equal to
 * that of its index value ( Consider 1-based indexing )
 *
 */
public class ValueEqualToIndexValue {

    List<Integer> valueEqualToIndex(int arr[], int n) {
        List<Integer> res=new ArrayList<>();
        for(int i=0;i<n;i++)
            if((i+1)==arr[i])
                res.add(arr[i]);
        return res;
    }
}
