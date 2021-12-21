package com.zap.ds.array;

import java.util.Arrays;

public class ArrayBasics {

    public static void main(String[] args)
    {
        /**
         * 1D Array
         */
        // Array Declaration
            int ages[]; // Syntax - <type> <array_name> []
            float[] marks; // Syntax - <type>[] <array_name>

            //allocate memory
            ages = new int [10]; // Syntax - <array_name> = new <type>[array_size]
            marks = new float[10];

            //OR
            int company [] = new int[10]; // Syntax - <type> <array_name> [] = new <type>[array_size]

        // Array Initialization
            //Syntax - <array_name>[<subscript>] = <value>;
            ages[0] = 25;
            ages[1] = 40;
            ages[2] = 50;

            // Syntax - <type> <array_name> [] = { <list of values> };
            String[] gender = {"Male", "Female", "Other"};


        /**
         * 2D Arrays
          */

        // Declaration
        int twoDarray [] [];
        twoDarray = new int [3][4];

        int twoDarray1 [][] = new int[3][4];

        // Initialization
        int array [][] = {{1, 2, 3,}, {4, 5, 6}};


        int x [] [] =new int[3][];
        x[0] = new int[2];
        x[1] = new int[4];
        x[2] = new int[3];

    }
}
