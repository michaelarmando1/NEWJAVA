package com.michael.newjava.Collections;

import java.util.Arrays;
import java.util.List;

public class LearnArray {

    String [] PlayerNames;
    public LearnArray() {
        PlayerNames = new String[7];
    }

    public void setPlayerNames(String Gk, String p1, String p2, String p3, String p4, String p5, String p6) {
        PlayerNames[0] = Gk;
        PlayerNames[1] = p1;
        PlayerNames[2] = p2;
        PlayerNames[3] = p3;
        PlayerNames[4] = p4;
        PlayerNames[5] = p5;
        PlayerNames[6] = p6;
    }

    public String getPlayerNames() {
        for (String i: PlayerNames) {
            System.out.println(i);
        }
        return null;
    }

    public static void main(String[] args) {
        int [][] matrix = {{2,4,5}, {4,54,345,345,34}, {4, 54, 56, 46}};
        System.out.println(matrix[1][1] + " " + matrix[2][3] + " " + "the array length:" + matrix[1].length);

        String [] users = {"Mike", "Samson"};
        String userinput = "Mike";

        // Method 1
        for (String i : users) {
            if(userinput.equals(i)) {
                System.out.println("Successful Login");
                break;
            } else {
                System.out.println("Unsuccessful Login!");
                break;
            }
        }

        //method 2
        List usersList = Arrays.asList(users);
        System.out.println(usersList.contains(userinput));
    }


}
