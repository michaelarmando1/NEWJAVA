package com.michael.newjava.O_O_P.Abstraction;

import java.util.ArrayList;

public class NewcastleUTD implements FootballClub{
    @Override
    public String stadium() {
        return "St. James Park";
    }

    @Override
    public String coach() {
        return "Eddie Howe";
    }

    @Override
    public ArrayList<String> playersInfo() {
        ArrayList<String> newcastlePlayers = new ArrayList<>();
        newcastlePlayers.add(0, "Nick Pope");
        newcastlePlayers.add(1, "Kieran Trippier");
        newcastlePlayers.add(2, "Sven Botman");
        newcastlePlayers.add(3, "Paul Dummett");
        newcastlePlayers.add(4, "Fabian Schar");
        newcastlePlayers.add(5, "Sandro Tonali");
        newcastlePlayers.add(6, "Joelinton");
        newcastlePlayers.add(7, "Anthony Gordon");
        newcastlePlayers.add(8, "Harvey Barnes");
        newcastlePlayers.add(9, "Callum Wilson");
        newcastlePlayers.add(10, "Alexander Isak");

        return newcastlePlayers;
    }

    public static void main(String[] args) {
        System.out.println("The list of players : " + new NewcastleUTD().playersInfo());
    }
}
