package com.zap.ds.stack.puzzles;

import java.util.Stack;

public class LongestValidParenthesis {

    public static void main(String[] args){
        String input1 = ")()())";
        System.out.println(longestValidParentheses(input1));

        String input2 = "gogogh";
        System.out.println(longestValidParentheses(input2));
    }

    private static int longestValidParentheses(String string){
        char[] charInput = string.toCharArray();

        Stack<Character> stack = new Stack<>();
        int count = 0;

        for (int i = 0; i < charInput.length; i++){
            if(charInput[i] == '(' || charInput[i] == '{' || charInput[i] == '[') {
                stack.push(charInput[i]);
                //count++;
            }
            else if(charInput[i] == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
                count += 2;
            }
            else if(charInput[i] == '}' && !stack.isEmpty() && stack.peek() == '{' ){
                stack.pop();
                count += 2;
            }
            else if(charInput[i] == ']' && !stack.isEmpty() && stack.peek() == '[' ){
                stack.pop();
                count += 2;
            }
        }
        return count;

    }
}
