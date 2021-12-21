package com.zap.ds.hackerrank;

import java.util.Stack;

public class BalancedBrackets {
    public static void main(String[] args){
        System.out.println(isBalanced("{[()]}"));
        System.out.println(isBalanced("{[(])}"));
        System.out.println(isBalanced("{{[[(())]]}}"));

        System.out.println(isBalanced2("{[()]}"));
        System.out.println(isBalanced2("{[(])}"));
        System.out.println(isBalanced2("{{[[(())]]}}"));
    }

    static String isBalanced(String s) {
        char[] charArr = s.toCharArray();
        int length = charArr.length;
        int initial = 0;
        int finalVal = charArr.length;
        while(length > 0) {
            String stringValue;
            stringValue = s.substring(initial, finalVal);
            if (!findString(stringValue)) {
                return "NO";
            }
            initial++;
            finalVal--;
            length = length - 2;
        }

        return "YES";
    }

    static boolean findString(String string){
        if(string.startsWith("{") && string.endsWith("}")){
            return true;
        }else if(string.startsWith("(") && string.endsWith(")")){
            return true;
        }else if(string.startsWith("[") && string.endsWith("]")){
            return true;
        }
        return false;
    }

    static String isBalanced2(String s) {

        String result = isBalanced1(s) ? "YES" : "NO" ;
        return result;
    }

    public static boolean isBalanced1(String s) {
        int len=s.length();
        if(len==0 || s==null) return true;
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{')  stack.push(s.charAt(i));
            else if(s.charAt(i)==')' && !stack.empty() && stack.peek()=='(') stack.pop();
            else if(s.charAt(i)==']' && !stack.empty() && stack.peek()=='[') stack.pop();

            else if(s.charAt(i)=='}' && !stack.empty() && stack.peek()=='{') stack.pop();
            else return false;


        }
        return stack.empty();
    }


}
