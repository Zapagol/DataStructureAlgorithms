package com.zap.string.problems;

/**
 * Given a String S, reverse the string without reversing its individual words.
 * Words are separated by dots.
 *
 * Example:
 *  Input:
 *      S = i.like.this.program.very.much
 * Output: much.very.program.this.like.i
 * Explanation: After reversing the whole
 *      string(not individual words), the input
 *      string becomes
 *      much.very.program.this.like.i
 */
public class ReverseWordsInString {

    static String reverseWords(String s){
        String s1 = "";
        String[] arr = s.split("\\.");
        for(int i = arr.length - 1; i >= 0; i--){
            s1 = s1 + arr[i];
            if(i >= 1){
                s1 = s1 + ".";
            }
        }
        return s1;
    }

    public static void main(String[] args){
        System.out.println(reverseWords("i.like.this.program.very.much"));
    }
}
