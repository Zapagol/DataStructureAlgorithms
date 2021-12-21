package com.zap.ds.queue.puzzles;

import com.zap.ds.queue.LinkedListQueue;

import java.util.LinkedList;
import java.util.Queue;

public class ValidSubString {

    public static void main(String[] args){
        String input4 = "()(())(";
        System.out.println(longestValidParentheses(input4));
    }

    private static int longestValidParentheses(String string){
        char[] charInput = string.toCharArray();

        Queue<Character> queue = new LinkedList<>();
        int count = 0;

        for (int i = 0; i < charInput.length; i++){
            if(charInput[i] == '(' || charInput[i] == '{' || charInput[i] == '[') {
                queue.add(charInput[i]);
            }
            else if(charInput[i] == ')' && !queue.isEmpty() && queue.peek() == '(') {
                queue.remove();
                count += 2;
            }
            else if(charInput[i] == '}' && !queue.isEmpty() && queue.peek() == '{' ){
                queue.remove();
                count += 2;
            }
            else if(charInput[i] == ']' && !queue.isEmpty() && queue.peek() == '[' ){
                queue.remove();
                count += 2;
            }
        }
        return count;

    }
}
