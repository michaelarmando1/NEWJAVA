package com.michael.newjava.O_O_P.Abstraction;

import java.util.ArrayList;

public class ManchesterUTD implements FootballClub {

    @Override
    public String stadium() {
        return "Old Trafford";
    }

    @Override
    public String coach() {
        return "Erik Ten Haag";
    }

    @Override
    public ArrayList<String> playersInfo() {
        ArrayList<String> unitedPlayers = new ArrayList<>();
        unitedPlayers.add(0, "Andre Onana");
        unitedPlayers.add(1, "Harry Maguire");
        unitedPlayers.add(2, "Jonny Evans");
        unitedPlayers.add(3, "Wan Bissaka");
        unitedPlayers.add(4, "Diogo Dalot");
        unitedPlayers.add(5, "Casemiro");
        unitedPlayers.add(6, "Bruno Fernandes");
        unitedPlayers.add(7, "Amrabat");
        unitedPlayers.add(8, "Marcus Rashford");
        unitedPlayers.add(9, "Holjund");
        unitedPlayers.add(10, "Antony");

        return unitedPlayers;
    }

    public static void main(String[] args) {
        System.out.println("The list of players : " + new ManchesterUTD().playersInfo());
    }
}
