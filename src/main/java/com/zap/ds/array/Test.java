package com.zap.ds.array;

public class Test {

    public static void main(String[] args){
        System.out.println(cut("arya", 1, 2));
    }

    static int cut(String input, int m, int n){
        int size = input.length();
        String org = input;
        String str1;
        String str2;
        int count = 1;
        for(int i = 0; i < size; i++){
             str1 = input.substring(size - m, size);
             input = input.substring(0, (size - m));
             input = str1 + input;
             if(!org.equals(input)) {
                 count++;
                 str2 = input.substring(size - n, size);
                 input = input.substring(0, (size - n));
                 input = str2 + input;
             }
             if(org.equals(input)){
                     break;
             }
        }
        count++;
        return count;
    }
}
