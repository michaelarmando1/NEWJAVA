package com.michael.newjava.O_O_P.Abstraction;

import java.util.ArrayList;

public class ManchesterCity implements FootballClub{
    @Override
    public String stadium() {
        return "The Etihad Stadium";
    }

    @Override
    public String coach() {
        return "Pep Guardiola";
    }

    @Override
    public ArrayList<String> playersInfo() {
        ArrayList<String> manchestercityPlayers = new ArrayList<>();
        manchestercityPlayers.add(0, "Ederson");
        manchestercityPlayers.add(1, "Kyle Walker");
        manchestercityPlayers.add(2, "John Stones");
        manchestercityPlayers.add(3, "Ruben Dias");
        manchestercityPlayers.add(4, "Akanji");
        manchestercityPlayers.add(5, "Phil Foden");
        manchestercityPlayers.add(6, "Kevin De Bruyne");
        manchestercityPlayers.add(7, "Jeremy Doku");
        manchestercityPlayers.add(8, "Erling Haaland");
        manchestercityPlayers.add(9, "Julian Alvarez");
        manchestercityPlayers.add(10, "Jack Grealish");

        return manchestercityPlayers;


    }

    public static void main(String[] args) {
        System.out.println("The list of players : " + new ManchesterCity().playersInfo());
    }
}
