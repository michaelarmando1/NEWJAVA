package com.michael.newjava;

import java.sql.SQLOutput;
import java.util.Scanner;
public class BankApp {

    private static long accountBalance = 200_000;

    public static void main(String[] args) {


        String username = "Armando";
        int pin = 2002;

        System.out.println("Welcome😎😎, Enter Your Username");

        String userName = new Scanner(System.in).nextLine();

        System.out.println("Enter Your Pin to Login");

        int pinCode = new Scanner(System.in).nextInt();

        if(pinCode == pin && userName.equals(username)) {
            System.out.println();
            System.out.println("Login Successful✅, Welcome Back " + username);
            System.out.println();
        } else {
            System.out.println("Invalid Pin, Please try again");
        }

        while(true) {

            System.out.println("What would you like to do");
            System.out.println();
            System.out.println("1. Withdraw Money");
            System.out.println("2. Check Balance");
            System.out.println("3. Send Money ");
            System.out.println("4. Deposit");
            System.out.println("5. Transaction History");
            System.out.println("0. Exit");
            System.out.println();

            int chooseOption = new Scanner(System.in).nextInt();

            switch (chooseOption) {
                case 1 -> withdraw();
                case 2 -> System.out.println("Your Account Balance is " + accountBalance);
                case 3 -> sendMoney();
                case 4 -> depositMoney();
                case 5 -> System.out.println("This is your transaction history");
                case 0 -> System.out.println("GoodBye😇!! " + userName);
                default -> System.out.println("Select the options within the field");
            }

            if (chooseOption == 0) {
                break;
            }


        }

    }


    public static void withdraw() {

        System.out.println("How much would you like to withdraw?");
        System.out.println();
        
        while(true) {

            float withdrawalAmount = new Scanner(System.in).nextFloat();

            double newAccBalance = accountBalance - withdrawalAmount;

            if (withdrawalAmount <= accountBalance) {
                System.out.println("Withdrawal Successful🤑🤑");
               System.out.println("\nYour New Balance is " + newAccBalance + "\n");

               break;
            } else if (withdrawalAmount > accountBalance) {
                System.out.println("Withdrawal Failed!! Amount Exceeding your Balance, Please Try Again\n");
                continue;
            }
        }

    }

    private static void sendMoney() {

        System.out.println("\nEnter Recipient's Account Number");
        long accountNumber = new Scanner(System.in).nextLong();


        System.out.println("\nHow much would you like to send to " + accountNumber + "?\n");

        while(true) {

             float sentAmount = new Scanner(System.in).nextFloat();

             double newAccBalance = accountBalance - sentAmount;

            if (sentAmount <= accountBalance) {
            System.out.println("\nTransaction Successful🤑🤑, You have successfully sent " +  sentAmount + " to " + accountNumber);
            System.out.println("Your New Balance is " + newAccBalance + "\n");
            break;
          } else {
            System.out.println("Error, Insufficient Funds to Initiate Transcation❌❗, Try Again😥");
            continue;
          }

        }

    }

    private static void depositMoney() {


        System.out.println("How much would you like to deposit");

        while(true) {
            long depositAmount = new Scanner(System.in).nextLong();

            long newAccBalance = accountBalance + depositAmount;

            if (depositAmount > 0) {
                System.out.println("Deposit Successful, Your new balance is " + newAccBalance + ", Enjoy your Day😎😎");
                break;
            } else if (depositAmount < 0) {
                System.out.println("Enter a reasonable amount greater than 0 to deposit😎😎");
                continue;
            }


        }

    }


}
