package com.zap.ds.queue.puzzles;

public class GenerateBinaryNumbers {

    static String itoa(int x, int base) {
        String s = "";
        while (x != 0)
        {
            s = (x % base) + s;
            x = x / base;
        }

        return s;
    }

    static void binaryGenerator(int n)
    {
        System.out.print("0 ");
        for (int i = 1; i <= n; i++)
        {
            String a = itoa(i, 2);
            System.out.print(a + " ");
        }
    }

    public static void main(String args[])
    {
        int n = 5;
        binaryGenerator(n);
    }
}
