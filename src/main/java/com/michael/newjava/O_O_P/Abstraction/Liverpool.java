package com.michael.newjava.O_O_P.Abstraction;

import java.util.ArrayList;

public class Liverpool implements FootballClub{
    @Override
    public String stadium() {
        return "Anfield";
    }

    @Override
    public String coach() {
        return "Jurgen Klopp";
    }

    @Override
    public ArrayList<String> playersInfo() {
        ArrayList<String> liverpoolPlayers = new ArrayList<>();
        liverpoolPlayers.add(0, "Alisson");
        liverpoolPlayers.add(1, "Virgil Van Dijk");
        liverpoolPlayers.add(2, "Ibrahima Konate");
        liverpoolPlayers.add(3, "Andy Robertson");
        liverpoolPlayers.add(4, "Trent Alexander-Arnold");
        liverpoolPlayers.add(5, "Harvey Elliott");
        liverpoolPlayers.add(6, "Dominik ");
        liverpoolPlayers.add(7, "Ryan Gravenberch");
        liverpoolPlayers.add(8, "Mohamed Salah");
        liverpoolPlayers.add(9, "Luis Diaz");
        liverpoolPlayers.add(10, "Darwin Nunez");

        return liverpoolPlayers;
    }

    public static void main(String[] args) {
        System.out.println("The list of players : " + new Liverpool().playersInfo());
    }
}
