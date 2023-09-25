package com.patterns;

/* 
 * Write a Java program to print the following square pattern:
                
                * * * *
                * * * *
                * * * *
                * * * *

 */


public class SquarePatterns {
    public static void main(String[] args) {
        int row = 4;
        System.out.println();
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row; j++) {
                System.out.print("* ");
                
            }
            System.out.println();
        }
    }
    
}
