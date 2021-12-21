package com.zap.ds.stack.puzzles;

import java.util.*;

public class JNext {

    public static void main(String[] args){
        int[] number = {1, 4, 7, 4, 5, 8, 4, 1, 2, 6};

        Stack<Integer> intStack = new Stack<>();
        Queue<Integer> queueA = new LinkedList<>();
        Set<Integer> set = new HashSet<>();

        for(int i = 0; i < number.length; i++){
            intStack.push(number[i]);
            set.add(number[i]);
        }

        if(set.size() == 1){
            System.out.println(intStack);
        }else {
            while (!intStack.isEmpty()) {
                int value1 = intStack.pop();
                int value2 = intStack.pop();
                if (value1 > value2) {
                    intStack.push(value1);
                    queueA.add(value2);
                    while (!queueA.isEmpty()) {
                        intStack.push(queueA.remove());
                    }
                    break;
                } else {
                    queueA.add(value1);
                    intStack.push(value2);
                }
            }
            System.out.println(intStack);
        }
    }
}
