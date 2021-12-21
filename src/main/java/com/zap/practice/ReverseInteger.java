package com.zap.practice;

public class ReverseInteger {
    public static int reverseInteger(int number){
        int rev = 0;
        while(number > 0){
            rev = rev * 10 + number % 10;
            number = number / 10;
        }
        return rev;
    }
    public static void main(String[] args){
        System.out.println(reverseInteger(12345));
    }
}
