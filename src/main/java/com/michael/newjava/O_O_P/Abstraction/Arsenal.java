package com.michael.newjava.O_O_P.Abstraction;

import java.util.ArrayList;

public class Arsenal implements FootballClub{

    @Override
    public String stadium() {
        return "Emirates Stadium";
    }

    @Override
    public String coach() {
        return "Mikel Arteta";
    }

    @Override
    public ArrayList<String> playersInfo() {
        ArrayList<String> players = new ArrayList<>();
        players.add(0, "David Raya");
        players.add(1, "William Saliba");
        players.add(2, "Ben White");
        players.add(3, "Gabriel");
        players.add(4, "Oleksandr Zinchenko");
        players.add(5, "Martin Odegaard");
        players.add(6, "Jorginho");
        players.add(7, "Declan Rice");
        players.add(8, "Bukayo Saka");
        players.add(9, "Gabriel Martinelli");
        players.add(10, "Gabriel Jesus");

        return players;

    }

    public static void main(String[] args) {
        System.out.println("The list of players : " + new Arsenal().playersInfo());
    }
}
