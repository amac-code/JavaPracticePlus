package variables_datatypes;

import java.util.*;

/* 
 * input 3 numbers
 * output avg of 3 numbers
 */

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int sum = a + b + c;
        double avg = (double) sum / 3; // type casting is done here

        System.out.println("Sum of " + a + ", " + b + " and " + c + " is: " + sum);
        System.out.printf("Average of %d, %d, and %d is: %.2f%n", a, b, c, avg); // Using printf for 2 decimal places
        sc.close();
    }

}
