package com.zap.ds.linkedlist.puzzles;

public class Test {
    public static void main(String[] args){

        int n = 15;
        int [] a = {6, 5, 2, 3, 5, 2, 2, 1, 1, 5, 1, 3, 3, 3, 5};

        System.out.println(repeatedString("a", 1000000000000L));
        System.out.println(countingValleys(8, "UDDDUDUU"));
    }


    static long repeatedString(String s, long n) {
        int length = s.length();
        long remainder = n % length ;
        long divisor = n / length ;
        int maxValue = 0;
        int max2 = 0;
        char[] chars = s.toCharArray();

        for(int i = 0; i < chars.length; i++)
        {
            if(chars[i] == 'a'){
                maxValue++;
            }
        }

        char[] charArr = s.substring(0, (int)remainder).toCharArray();
        for(int i = 0; i < charArr.length; i++){
            if(charArr[i] == 'a'){
                max2++;
            }
        }

        return (maxValue * divisor + max2);
    }

    static int countingValleys(int n, String s) {
        char[] charArr = s.toCharArray();
        int result = -1;

        for(int i = 0; i < charArr.length; i++){
                if(charArr[i] == 'U'){
                    result++;
                }else{
                    result--;
                }
        }

        return result;
    }
}
