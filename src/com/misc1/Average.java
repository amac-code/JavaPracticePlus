package com.misc1;


// calculating the average from 25 exam scores

import java.util.*;

public class Average {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = 4;
        int[] scores = new int[num];
        for (int i = 0; i < num; i++) {
            System.out.print("Enter marks " + (i + 1) + ": ");
            scores[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(scores));

        int sum = 0;
        for (int i = 0 ; i<num; i++) {
            sum +=scores[i];
        }
        System.out.println("Sum is: " + sum);

        double avg;
        avg = (double)sum/num;
        System.out.println("Average of " + num + " marks are: " + avg);
        sc.close();

    }
}