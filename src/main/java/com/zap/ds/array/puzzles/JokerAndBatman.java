package com.zap.ds.array.puzzles;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JokerAndBatman {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner s=new Scanner(System.in);
        int testCases=s.nextInt();
        while(testCases>0){
            Map<Integer,Integer> map=new HashMap<>();
            int n=s.nextInt();
            int list=s.nextInt();
            int stripLength=s.nextInt();
            for(int i=1;i<=list;i++){
                int size=s.nextInt();
                while(size>0){
                    int color=s.nextInt();
                    map.put(color,i);
                    size--;
                }
            }
            int[] colors=new int[stripLength];
            for(int i=0;i<stripLength;i++)
                colors[i]=s.nextInt();
            int current=map.get(colors[0]),count=1;
            for(int i=1;i<stripLength;i++){
                int currentList=map.get(colors[i]);
                if(currentList==current)
                    continue;
                else{
                    count++;
                    current=currentList;
                }
            }
            System.out.println(count);
            testCases--;
        }
    }
}
