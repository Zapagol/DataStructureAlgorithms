package com.zap.ds.stack.puzzles;

import java.util.Stack;

public class ParanthesisChecker {

    public static void main(String[] args){
        String input = "[()]{}{[()()]()}";
        System.out.println(pChecker(input));

        String input1 = "[()]{}([()()]()}";
        System.out.println(pChecker(input1));

        String input2 = "}{";
        System.out.println(pChecker(input2));

    }

    private static String pChecker(String string){

        if(string.isEmpty()) return "balanced";
        char[] charInput = string.toCharArray();

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < charInput.length; i++){
            if(charInput[i] == '(' || charInput[i] == '{' || charInput[i] == '[') stack.push(charInput[i]);
            else if(charInput[i] == ')' && !stack.isEmpty() && stack.peek() == '(') stack.pop();
            else if(charInput[i] == '}' && !stack.isEmpty() && stack.peek() == '{' ) stack.pop();
            else if(charInput[i] == ']' && !stack.isEmpty() && stack.peek() == '[' ) stack.pop();
            else return "unbalanced";
        }

        if(stack.isEmpty()) return "balanced";
        else return "unbalanced";

    }


}
