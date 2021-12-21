package com.zap.string.problems;

import java.util.*;

/**
 * Given an array of strings, return all groups of strings that are anagrams. The groups must be created
 * in order of their appearance in the original array. Look at the sample case for clarification.
 *
 * Example :
 *  Input:
 *      N = 5
 *      words[] = {act,god,cat,dog,tac}
 * Output:
 *      god dog
 *      act cat tac
 * Explanation:
 *      There are 2 groups of
 *      anagrams "god", "dog" make group 1.
 *      "act", "cat", "tac" make group 2.
 */
public class FindAnagrams {



    static void findAnagrams(String[] arr){
        Map<String, List<String>> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            String actualWord = arr[i];
            char[] charArray = actualWord.toCharArray();
            Arrays.sort(charArray);
            String sortedString = new String(charArray);
            if(map.containsKey(sortedString)){
                map.get(sortedString).add(actualWord);
            }else{
                List<String> list = new ArrayList<>();
                list.add(actualWord);
                map.put(sortedString, list);
            }
        }
        // print all the values where size is > 1
        // If you want to print non-anagrams,
        // just print the values having size = 1
        for (String s : map.keySet()) {
            List<String> values = map.get(s);
            if (values.size() > 1) {
                System.out.print(values);
            }
        }
    }
    public static void main(String[] args)
    {

        // Driver program
        String[] arr = { "cat", "dog", "tac", "god", "act" };
        findAnagrams(arr);
    }
}
