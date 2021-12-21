package com.zap.ds.array;

public class MatrixMultiplication {

    static void matrixMultiplication(int row1, int col1, int a[][],
                                     int row2, int col2, int b[][]){
        if(col1 != row2){
            System.out.println("Multiplication111 not possible");
            return;
        }
        int c[][] = new int[row1][col2];

        for(int i = 0; i < row1; i++){
            for(int j = 0; j < col2; j++){
                for(int k = 0; k < col1; k++){
                    c[i][j] += a[i][k] * b[k][j];
                }
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args){
        int row1 = 4, col1 = 3, row2 = 3, col2 = 4;

        int a[][] = { { 1, 1, 1 },
                { 2, 2, 2 },
                { 3, 3, 3 },
                { 4, 4, 4 } };

        int b[][] = { { 1, 1, 1, 1 },
                { 2, 2, 2, 2 },
                { 3, 3, 3, 3 } };

        matrixMultiplication(row1, col1, a,
                row2, col2, b);
    }
}
