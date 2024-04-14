package com.michael.newjava;
import java.util.Scanner;
public class Main {



    public void change_to_fahrenheits(double celsius) {
        double F = celsius * 9/5 + 32;
        //System.out.println(F);
    }

    public void volume_of_cylinder_with_height(double radius, double height) {
        double PI = 3.142;
        double Volume = PI * (radius * radius) * height;
        //System.out.println("The Volume of the cylinder with the height of " + height + " and radius of " + radius + " is " + Volume);
    }

    public void three_equations_of_motion(double v, double u, double a, double t){
        double V = u + (a * t);
        double U = v - (a * t);
        double A = (v - u) / t;
        double T = (v - u) / a;

         double first = U + (A * T);
         //System.out.println(first);
    }

    public static void main(String[] args) {

        Main main = new Main();
        main.volume_of_cylinder_with_height(5, 30);

        Main main2 = new Main();
        main2.three_equations_of_motion(5, 8, 5, 10);

        int a = 50;
        int b = 20;
        boolean result = a > b;
        //System.out.println(result);

        int y = 5;
        y = y - 2;
        y -= 2;

        // Conditions
        String message = "Mr.Timothy is disturbing us!";
        int length = message.length();
        //System.out.println(length);
        if (length > 28) {
            System.out.println("Greater than 28!");
        }
        else if (length == 28) {
            System.out.println("It is equals to 28!");
        }
        else {
            System.out.println("It is not greater than 28!");
        }

        Scanner input = new Scanner(System.in);
        experiment ex = new experiment();
        String result2 = ex.sum(8,4);
        System.out.println(result2);
    }

    // > , < , ==, >=, <=, !=
    //they all have a boolean return type

    // Logical Operators
    // && , ||, !



    //Assignments
    // Equations of Motion in one class (3 methods each for the formulas)
}