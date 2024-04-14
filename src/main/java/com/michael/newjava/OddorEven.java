package com.michael.newjava;

import java.util.Scanner;

public class OddorEven {
    public static void main(String[] args) {

        while (true) {
            System.out.println("Welcome, Enter a number to check if its Even or Odd");

            int number = new Scanner(System.in).nextInt();

            if (number % 2 == 0) {
                System.out.println("The Number is Even\n");
                continue;
            } else if (number % 2 == 1) {
                System.out.println("The Number is Odd\n");
                continue;
            }
        }

    }
}
