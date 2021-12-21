package com.zap.string.problems;

/**
 * Given a array of N strings, find the longest common prefix among all strings
 * present in the array.
 *
 * Example 1:
 *      Input:
 *          N = 4
 *          arr[] = {geeksforgeeks, geeks, geek,
 *                  geezer}
 *          Output: gee
 *      Explanation: "gee" is the longest common
 *                  prefix in all the given strings.
 *
 * Example 2:
 *      Input:
 *          N = 2
 *          arr[] = {hello, world}
 *      Output: -1
 *      Explanation: There's no common prefix
 *                  in the given strings.
 */
public class LongestCommonPrefix {

    static void longestCommonPrefix(String[] arr){
        String prefix = arr[0];
        for(int i = 1; i < arr.length; i++){
            //find commons prefix between arr[i] and arr[i+1]
            // then pass compare this prefix with next element
            // in array
            prefix = longestCommonPrefixUtil(prefix, arr[i]);
        }
        if(prefix.isEmpty()) System.out.println(-1);
        else System.out.println(prefix);
    }

    static String longestCommonPrefixUtil(String s1, String s2){
        int commonLength = (s1.length() < s2.length()) ? s1.length(): s2.length();
        char[] char1 = s1.toCharArray();
        char[] char2 = s2.toCharArray();
        String s = "";
        for(int i = 0; i < commonLength; i++){
                if(char1[i] == char2[i]) s = s + char1[i];
                else break;
        }
        return s;
    }

    public static void main(String[] args){
        String[] arr1 = {"geeksforgeeks", "geeks", "geek", "geezer"};
        longestCommonPrefix(arr1);

        String[] arr2 = {"hello", "world"};
        longestCommonPrefix(arr2);
    }

}
