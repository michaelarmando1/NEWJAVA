package com.michael.newjava.Assignments;

import java.util.Scanner;

public class EvenRegUserInput {

    public static void registerUse_and_display () {
        System.out.println("Enter your Name?");
        String name = new Scanner(System.in).nextLine();

        System.out.println("Choose 1. For Regular 2. VIP 3. VVIP");

        String choice = new Scanner(System.in).nextLine();

        if (choice.equals("1")) {
            EventAttendees users = new EventAttendees(name, Category.Regular);
        } else if(choice.equals("2")) {
            EventAttendees users = new EventAttendees(name, Category.VIP);
        } else if (choice.equals("3")) {
            EventAttendees users = new EventAttendees(name, Category.VVIP);
        } else {
            System.out.println("Invalid Option, E be like say you no go school");
        }

    }

    public static void main(String[] args) {
        System.out.println("Welcome!");
        System.out.println("Choose 1 to register or 2 to check details if registered, 3 to exit");
        String choice = new Scanner(System.in).nextLine();

        if(choice.equals("1")) {
            registerUse_and_display();
        }
    }
}
