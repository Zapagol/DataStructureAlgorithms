package com.zap.string.problems;

/**
 * Given a string, find the longest substring which is palindrome.
 * Example 1:
 *      Input: Given string :"forgeeksskeegfor",
 *      Output: "geeksskeeg"
 *
 *      Input: Given string :"Geeks",
 *      Output: "ee"
 *
 * Solutions:
 *      Approach 1: Brute Force
 *          - The simple approach is to check each substring whether the substring is a palindrome or not. To do
 *          this first, run three nested loops, the outer two loops pick all substrings one by one by fixing the
 *          corner characters, the inner loop checks whether the picked substring is palindrome or not.
 *
 *          - Time Complexity: O(n2)
 *          - Auxiliary Complexity: O(1)
 *
 *      Approach 2: Dynamic Programming
 *          - Maintain a boolean table[n][n] that is filled in bottom up manner.
 *          - The value of table[i][j] is true, if the substring is palindrome, otherwise false.
 *          - To calculate table[i][j], check the value of table[i+1][j-1], if the value is true and str[i] is
 *          same as str[j], then we make table[i][j] true. Otherwise, the value of table[i][j] is made false.
 *          - We have to fill table previously for substring of length = 1 and length =2 because
 *          as we are finding , if table[i+1][j-1] is true or false , so in case of
 *              (i) length == 1 , lets say i=2 , j=2 and i+1,j-1 doesn’t lies between [i , j]
 *              (ii) length == 2 ,lets say i=2 , j=3 and i+1,j-1 again doesn’t lies between [i , j].
 */
public class LongestPalindromeSubString {

    static int longestPalSubString(String str){

        // get length of input string
        int n = str.length();

        // table[i][j] will be false if
        // substring str[i..j] is not palindrome.
        // Else table[i][j] will be true
        boolean table[][] = new boolean[n][n];

        // All substrings of length 1 are palindromes
        int maxLength = 1;
        for (int i = 0; i < n; i++)
            table[i][i] = true;

        // check for sub-string of length 2.
        int start = 0;
        for (int i = 0; i < n - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                table[i][i + 1] = true;
                start = i;
                maxLength = 2;
            }
        }

        // Check for lengths greater than 2.
        // k is length of substring
        for (int k = 3; k <= n; k++) {

            // Fix the starting index
            for (int i = 0; i < n - k + 1; i++) {
                // Get the ending index of substring from
                // starting index i and length k
                int j = i + k - 1;

                // checking for sub-string from ith index to
                // jth index iff str.charAt(i+1) to
                // str.charAt(j-1) is a palindrome
                if (table[i + 1][j - 1]
                        && str.charAt(i) == str.charAt(j)) {
                    table[i][j] = true;

                    if (k > maxLength) {
                        start = i;
                        maxLength = k;
                    }
                }
            }
        }
        System.out.print("Longest palindrome substring is; ");
        printSubStr(str, start,
                start + maxLength - 1);

        // return length of LPS
        return maxLength;
    }
    static void printSubStr(
            String str, int low, int high)
    {
        System.out.println(
                str.substring(
                        low, high + 1));
    }

    // Driver program to test above functions
    public static void main(String[] args)
    {

        String str = "forgeeksskeegfor";
        System.out.println("Length is: " + longestPalSubString(str));
    }
}
