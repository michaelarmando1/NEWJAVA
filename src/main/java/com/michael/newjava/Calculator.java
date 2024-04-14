package com.michael.newjava;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        int num1;
        int num2;
        int add_result;
        int sub_result;
        int multi_result;
        int div_result;


        System.out.println("Hello, Input your Username????");

        String userName = new Scanner(System.in).nextLine();

        System.out.println("Welcome " + userName + "\n");

        while(true) {

            System.out.println("What would you like to do today\n");

            System.out.println("1. Addition Of Numbers");
            System.out.println("2. Subtraction Of Numbers");
            System.out.println("3. Multiplication Of Numbers");
            System.out.println("4. Division Of Numbers");
            System.out.println("0. Exit the Calculator\n");

            int chooseOption = new Scanner(System.in).nextInt();


            if(chooseOption == 1) {
                System.out.println("Please Enter Two Numbers\n");
                num1 = new Scanner(System.in).nextInt();
                num2 = new Scanner(System.in).nextInt();
                add_result = num1 + num2;
                System.out.println("The result is " + add_result + "\n");
                continue;
            }
            else if (chooseOption == 2) {
                System.out.println("Please Enter Two Numbers\n");
                num1 = new Scanner(System.in).nextInt();
                num2 = new Scanner(System.in).nextInt();
                sub_result = num1 - num2;
                System.out.println("The result is " + sub_result + "\n");
                continue;
            }
            else if (chooseOption == 3) {
                System.out.println("Please Enter Two Numbers\n");
                num1 = new Scanner(System.in).nextInt();
                num2 = new Scanner(System.in).nextInt();
                multi_result = num1 * num2;
                System.out.println("The result is " + multi_result + "\n");
                continue;
            }
            else if (chooseOption == 4) {
                System.out.println("Please Enter Two Numbers\n");
                num1 = new Scanner(System.in).nextInt();
                num2 = new Scanner(System.in).nextInt();
                div_result = num1 / num2;
                System.out.println("The result is " + div_result + "\n");
                continue;
            }
            else if (chooseOption == 0) {
                System.out.println("GoodBye " + userName);
                break;
            }
            else if (chooseOption < 0 && chooseOption > 4){
                System.out.println("Sorry, Enter Valid Input and Try Again");
                continue;
            }


        }

    }



}
