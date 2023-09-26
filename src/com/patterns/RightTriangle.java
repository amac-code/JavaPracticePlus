package com.patterns;

//Problem Statement:
/* 
 Write a Java program to print the following right triangle pattern:

    *
    * *
    * * *
    * * * *
    * * * * *

*/

public class RightTriangle {
    public static void main(String[] args) {
        int row = 5;
        System.out.println();

        for (int i = 1; i <= row; i++) {
            
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}



//Dry Run:
/**
 *  Dry Run of this program for row = 5:

    Outer loop, i = 1:
        Inner loop, j = 1: Prints * , result: * .
        Move to the next line. 
        Output so far: * .
    
    Outer loop, i = 2:
        Inner loop, j = 1: Prints * , result: * .
        Inner loop, j = 2: Prints * , result: * * .
        Move to the next line.
        Output so far: * * .

    This pattern continues for i = 3, i = 4, and i = 5, with each row adding one more * to the output.
 */
