package com.misc1;

public class PrintEven {
    public static void main(String[] args) throws Exception {
        int num = 10;

        while (num <= 100) {
            System.out.print(num);
            if (num < 100) {
                System.out.print(", ");
            }
            num += 2;
        }
        System.out.println();
    }
    
}
