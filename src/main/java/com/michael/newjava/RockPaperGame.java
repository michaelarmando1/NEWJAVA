package com.michael.newjava;

import java.util.Random;
import java.util.Scanner;

public class RockPaperGame {
    public static void main(String[] args) {

        System.out.println("Welcome to the Rock, Paper and Scissors Game😎😎,");
        System.out.println("Enter Your Name");
        Scanner name = new Scanner(System.in);
        String input_name = name.nextLine();
        System.out.println("Welcome to the Game "+ input_name);
        System.out.println();
        System.out.println("Choose a number from 0 to 2");
        System.out.println();
        System.out.println("0 = Rock");
        System.out.println("1 = Paper");
        System.out.println("2 = Scissors");
        System.out.println("3 = Quit");
        System.out.println();

        while(true) {

            Scanner optionsList = new Scanner(System.in);
            int chooseOption = optionsList.nextInt();

            Random random = new Random();
            int randomNumber = random.nextInt(3);

            if (chooseOption == 0 && randomNumber == 0) {
                System.out.println("You and Computer chose Rock");
                System.out.println("Tie Game");
            } else if (chooseOption == 1 && randomNumber == 0) {
                System.out.println("You chose Paper and Computer chose Rock");
                System.out.println("Congratulations, You Win");
            } else if (chooseOption == 2 && randomNumber == 0) {
                System.out.println("You chose Scissors and Computer chose Rock");
                System.out.println("Ouch, You Losee😥😥");
            } else if (chooseOption == 0 & randomNumber == 1) {
                System.out.println("You chose Rock and Computer chose Paper");
                System.out.println("You Losee😥😥");
            } else if (chooseOption == 1 && randomNumber == 1){
                System.out.println("You and Computer chose Paper");
                System.out.println("Tie Game");
            } else if (chooseOption == 2 && randomNumber == 1) {
                System.out.println("You chose Scissors and Computer chose Paper");
                System.out.println("Congratulations, You Win");
            }
            else if (chooseOption == 0 && randomNumber == 2) {
                System.out.println("You chose Rock and Computer chose Scissors");
                System.out.println("Congratulations, You Win");
            } else if (chooseOption == 1 && randomNumber == 2) {
                System.out.println("You chose Paper and Computer chose Scissors");
                System.out.println("You Losee😥😥");
            } else if (chooseOption == 2 && randomNumber == 2) {
                System.out.println("You and Computer chose Scissors");
                System.out.println("Tie Game");

            } else if (chooseOption == 3) {
                System.out.println("You quit the Game, see you later fella!!😎😎😎");
                break;
            } else {
                System.out.println("Invalid Number, Pick options between 0 - 3");
            }
        }



    }

}
