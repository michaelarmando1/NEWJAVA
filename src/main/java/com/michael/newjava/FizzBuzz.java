package com.michael.newjava;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        System.out.println("Enter a number ");

        int number = new Scanner(System.in).nextInt();

        for (int i = 1; i <= number; i++) {

            if (i % 3 == 0 && i % 5 != 0) {
                    System.out.println("Fizz");

            } else if (i % 5 == 0 && i % 3 != 0) {
                System.out.println("Buzz");

            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Fizz Buzz");
            }
        }


    }
}
