package com.zap.ds.hackerrank;

import javafx.beans.binding.ObjectExpression;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class SparseArrays {

    public static void main(String[] args){
        String[] strings = {"abcde", "sdaklfj", "asdjf", "na", "basdn", "sdaklfj", "asdjf", "na",
                "asdjf", "na", "basdn", "sdaklfj", "asdjf"};
        String[] queries = {"abcde", "sdaklfj", "asdjf", "na", "basdn"};

        Object[] arr = matchingStrings(strings, queries);

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

        Map<String, Integer> map = matchingStrings1(strings, queries);

        map.forEach((k,v)->System.out.println("Item : " + k + " Count : " + v));
    }

    static Object[] matchingStrings(String[] strings, String[] queries) {
        Map<String, Integer> mapArr = new LinkedHashMap<>();

        for(int i = 0; i < queries.length; i++){
            mapArr.put(queries[i], 0);
        }

        for(int j = 0; j < strings.length; j++){
            if(mapArr.containsKey(strings[j])){
                int count = mapArr.get(strings[j]);
                mapArr.put(strings[j], count + 1);
            }
        }

        return mapArr.values().toArray();
    }

    static Map<String, Integer> matchingStrings1(String[] strings, String[] queries) {
        Map<String, Integer> mapArr = new LinkedHashMap<>();

        for(int i = 0; i < queries.length; i++){
            mapArr.put(queries[i], 0);
        }

        for(int j = 0; j < strings.length; j++){
            if(mapArr.containsKey(strings[j])){
                int count = mapArr.get(strings[j]);
                mapArr.put(strings[j], count + 1);
            }
        }

        return mapArr;
    }
}
