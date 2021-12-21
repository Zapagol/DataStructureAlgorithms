package com.zap.string.problems;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Given a string of characters, find the length of the longest proper prefix which is
 * also a proper suffix.
 *
 * Example 1:
 *      Input: s = "abab"
 *      Output: 2
 *      Explanation: "ab" is the longest proper prefix and suffix.
 *
 * Example 2:
 *      Input: s = "aaaa"
 *      Output: 3
 *      Explanation: "aaa" is the longest proper prefix and suffix.
 */
public class LongestPrefixSuffix {

    static int longestPrefixSuffix(String s){
        char[] arr = s.toCharArray();
        int start = 1;
        int end = arr.length - 1;
        int length = 0;
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();
        while (start < arr.length){
            stack.push(arr[start]);
            queue.add(arr[end]);
            start++;
            end--;
        }
        while (!stack.isEmpty() && !queue.isEmpty()){
            if(stack.pop() == queue.remove()){
                length++;
            }
        }
        return length;
    }

    public static void main(String[] args){
        System.out.println(longestPrefixSuffix("abab"));
    }
}
