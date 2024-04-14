package com.michael.newjava;

import java.util.Date;
import java.util.Scanner;

public class Scannerclass {
    public static void main(String[] args) {

//        String username = "Anjola";
//        String password = "Shebayi";
//
//        System.out.println("What is your Username?");
//
//        // This is to collect user inputs
//        Scanner input = new Scanner(System.in);
//        String username_input = input.nextLine();
//
//        System.out.println("What is your Password?");
//
//        Scanner input2 = new Scanner(System.in);
//        String password_input = input2.nextLine();

//        if(username_input.equals(username) && password_input.equals(password)) {
////            if (username_input.toLowerCase().equals(username.toLowerCase()) && password_input != password.toLowerCase()) {
////                System.out.println("Wrong Password, Try Again or Click Forgot Password");
////            }
////            else if (username_input != username && password_input.equals(password)) {
////                System.out.println("Wrong Username, Try Again");
//            System.out.println("Welcome Anjola, Washere Joor🙄🙄🙄🙄");
//        }
//        else {
//            System.out.println("Wrong Credentials, Try Again");
//        }

       Date date = new Date();
       int current_day = date.getDay();

       switch (current_day) {
           case 1:
               System.out.println("Today is Monday! " + date.getTime());
               break;
           case 2:
               System.out.println("Today is Tuesday! " + date.getHours() + ":" + date.getMinutes() + "pm") ;
               break;
           case 3:
               System.out.println("Today is Wednesday! " + date.getTime());
               break;
           case 4:
               System.out.println("Today is Thursday! " + date.getTime());
               break;
           case 5:
               System.out.println("Today is Friday! " + date.getTime());
               break;
           case 6:
               System.out.println("Today is Saturday! " + date.getTime());
               break;
           case 7:
               System.out.println("Today is Sunday! " + date.getTime());
               break;
           default:
               System.out.println("Not a day of the week on earth");
       }



    }
}

// Write a code to check the username and password