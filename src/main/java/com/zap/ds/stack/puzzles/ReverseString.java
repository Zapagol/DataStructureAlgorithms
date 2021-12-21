package com.zap.ds.stack.puzzles;

import java.util.Stack;

public class ReverseString {
    public static void main(String[] args){
        String stringInput = "JAVA";

        System.out.println("Reversed String = " + reversedString(stringInput));
        System.out.println("Reversed String = " + reverse(stringInput));
    }

    /**
     * Using Stack and Character Array
     * @param input
     * @return
     */
    public static String reversedString(String input){

        //convert String into char Array
        char[] ch = input.toCharArray();

        //Create empty Stack
        Stack<Character> stack = new Stack<>();

        //create empty array
        char[] reversedArray = new char[input.length()];

        //return String if it is empty/null
        if(input == null || input.equals(""))
            return input;

        //Add each character into stack
        for(int i=0; i<ch.length; i++){
            stack.push(ch[i]);
        }

        int pointer = 0;

        //retrive each character from stack and add into char Array
        while (!stack.isEmpty()){
            reversedArray[pointer++] = stack.pop();
        }

        //convert char Array into String
        return String.copyValueOf(reversedArray);
    }

    /**
     * Using Stack and StringBuilder
     * @param str
     * @return
     */
    public static String reverse(String str)
    {
        // base case: if string is null or empty
        if (str == null || str.equals(""))
            return str;

        // create an empty stack of characters
        Stack<Character> stack = new Stack<Character>();

        // push every character of the given string into the stack
        for (int i = 0; i < str.length(); i++)
            stack.push(str.charAt(i));

        // pop characters from the stack and append them into StringBuilder
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty())
            sb.append(stack.pop());

        // convert StringBuilder to String and return
        return sb.toString();
    }
}
