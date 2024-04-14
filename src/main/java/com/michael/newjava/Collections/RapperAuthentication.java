package com.michael.newjava.Collections;

import java.util.Scanner;

public class RapperAuthentication {
    public Rapper saveRapper() {
        System.out.println("What is your name as a Rapper?");
        String name = new Scanner(System.in).nextLine();

        System.out.println("Choose your status??\n");
        System.out.println("1. Popular");
        System.out.println("2. Not Popular");

        String status = new Scanner(System.in).nextLine();

        if (status.equals("1")) {
            Rapper rapper = new Rapper(name, RapperStatus.Popular);
            System.out.println(rapper.getName() + " " + rapper.getStatus());
        } else if (status.equals("2")) {
            Rapper rapper = new Rapper(name, RapperStatus.Not_Popular);
            System.out.println(rapper.getName() + " " + rapper.getStatus());
        }


        return null;
    }

    public void displayRapper(Rapper rapper) {
        System.out.println(rapper.getName() + " is a " + rapper.getStatus()+ " rapper😎");
    }

    public static void main(String[] args) {
        System.out.println("Welcome Rapper!!!");
        System.out.println("Select 1. To register for the event or 2. To check details if registered" );
        String choice = new Scanner(System.in).nextLine();
        if(choice.equals("1")) {
            Rapper rapper = new RapperAuthentication().saveRapper();
            new RapperAuthentication().displayRapper(rapper);
        }
    }

}
