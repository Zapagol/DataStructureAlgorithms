package com.zap.string.problems;

import java.util.HashSet;
import java.util.Set;

/**
 * Length of the longest substring without repeating characters
 *  - For “ABDEFGABEF”, the longest substring are “BDEFGA” and “DEFGAB”, with length 6.
 *  - For “BBBB” the longest substring is “B”, with length 1.
 *  - For “GEEKSFORGEEKS”, there are two longest substrings shown in the below diagrams, with length 7
 *
 *  Approaches:
 *      1. Brut Force : We can consider all substrings one by one and check for each substring whether it
 *      contains all unique characters or not. There will be n*(n+1)/2 substrings. Whether a substring contains
 *      all unique characters or not can be checked in linear time by scanning it from left to right and
 *      keeping a map of visited characters. Time complexity of this solution would be O(n^3).
 *          - Complexity : O(n*n*n)
 *      2. Linear Time : Using this solution the problem can be solved in linear time using the window sliding
 *      technique. Whenever we see repetition, we remove the window till the repeated string.
 */
public class LongestUniqueSubString {

    static int longestUniqueSubString(String s){
        int maxLength = -1;
        String result = "";
        if(s.isEmpty()) return 0;
        if(s.length() == 1) return 1;
        for(char c : s.toCharArray()){
            String current = String.valueOf(c);
            if(s.contains(current)){
                result = result.substring(result.indexOf(current) + 1);
            }
            result = result + current;
            maxLength = Math.max(result.length(), maxLength);
        }

        return maxLength;
    }
    static String longestUniqueSubStringUsingSet(String s){
        String longestTilNow = "";
        String longestOverAll = "";
        HashSet<Character> set = new HashSet<>();
        char[] arr = s.toCharArray();
        for(int i = 0; i < arr.length; i++){
            if(set.contains(arr[i])){
                set.clear();
                longestTilNow = "";
            }
            set.add(arr[i]);
            longestTilNow = longestTilNow + arr[i];
            if(longestTilNow.length() > longestOverAll.length()) longestOverAll = longestTilNow;
        }
        return longestOverAll;
    }
    // Driver code
    public static void main(String[] args)
    {
        String str = "abcad";
        System.out.println("The input string is " + str);

        int len = longestUniqueSubString(str);
        System.out.println("The length of the longest "
                + "non-repeating character "
                + "substring is " + len);

        String str1 = "geeksforgeeks";
        System.out.println("The input string is " + str1);

        String len1 = longestUniqueSubStringUsingSet(str1);
        System.out.println("The length of the longest "
                + "non-repeating character "
                + "substring is " + len1);
    }
}
