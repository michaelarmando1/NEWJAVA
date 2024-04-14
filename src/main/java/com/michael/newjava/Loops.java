package com.michael.newjava;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
       //twotimestable();
       //threetimestable();
       //fourtimestable();
       //fivestimestable();

        System.out.println("Input your Username");

       Scanner username = new Scanner(System.in);
       String input_username = username.nextLine();

       System.out.println("Welcome Brotherly " + input_username + "😎😎");

       while(true) {

           System.out.println();
           System.out.println("Which Multiplication's Table do you want to see, Pick a number from 2 - 5");

        Scanner options = new Scanner(System.in);
        int optionList = options.nextInt();
        System.out.println();

            if (optionList == 2) {
                twotimestable();
                continue;
            } else if (optionList == 3) {
                threetimestable();
                continue;
            } else if (optionList == 4) {
                fourtimestable();
                continue;
            } else if (optionList == 5) {
                fivestimestable();
                continue;
            } else {
                System.out.println("Invalid Number, Select a Number within 2 to 5");
            }

        }



    }

    public static void twotimestable() {
        for (int x = 1; x <= 15; x++) {
            System.out.println("2 * " + x + " = " + 2 * x);
        }
    }

    public static void threetimestable() {
        for (int x = 1; x <= 15; x++) {
            System.out.println("3 * " + x + " = " + 3 * x);
        }
    }

    public static void fourtimestable() {
        for (int x = 1; x <= 15; x++) {
            System.out.println("4 * " + x + " = " + 4 * x);
        }
    }

    public static void fivestimestable() {
        for (int x = 1; x <= 15; x++) {
            System.out.println("5 * " + x + " = " + 5 * x);
        }
    }
}
