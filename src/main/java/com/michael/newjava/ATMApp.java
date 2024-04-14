package com.michael.newjava;

import java.util.Scanner;

public class ATMApp {
    public static void main(String[] args) {
        String name = "Mike";
        String pin = "123";

        int balance = 200_000;

        // Instance of a scanner class for user inputs
        Scanner inputCredentials = new Scanner(System.in);

        System.out.println("What is your name?");
        String userName = inputCredentials.nextLine(); // user inputs his/her name and it is stored in a variable
        System.out.println("Input your pin!!");
        String pin_Input = inputCredentials.nextLine(); // user inputs his/her pin and it is stored in a variable
          if(userName.equals(name) && pin_Input.equals(pin)) {
              System.out.println("Welcome " + userName + "🤑🥶");
              System.out.println("What would you like to do");
              System.out.println("1. Check Balance");
              System.out.println("2. Withdraw");
              System.out.println("3. Transfer Funds");
              System.out.println("4. Change Pin");
              System.out.println("5. Quit");

              Scanner userOptn = new Scanner(System.in);
              int userChoice = userOptn.nextInt();

              if (userChoice == 1) {
                  System.out.println("Confirm Pin");
                  Scanner pin_con = new Scanner(System.in);
                  String pin_confirm = userOptn.nextLine();

              }

          }
          else {
              System.out.println("Incorrect Credentials, Please try again later...");
          }
    }
}
