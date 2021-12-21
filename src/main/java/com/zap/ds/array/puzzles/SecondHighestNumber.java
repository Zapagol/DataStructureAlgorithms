package com.zap.ds.array.puzzles;

import java.util.ArrayList;
import java.util.List;

public class     SecondHighestNumber {
    public static void main(String[] args){
        int[] numbers = {110, 90, 45, 10, 20, 30, 100,200};

        int highest = 0;
        int secondHighest = 0;

        for(int i=0; i< numbers.length; i++){
            if(numbers[i] > highest){
                secondHighest = highest;
                highest = numbers[i];
            }else if(numbers[i] > secondHighest){
                secondHighest = numbers[i];
            }
        }

        System.out.println("Second highest number = " + secondHighest);
    }
}
