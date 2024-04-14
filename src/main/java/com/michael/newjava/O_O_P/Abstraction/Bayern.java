package com.michael.newjava.O_O_P.Abstraction;

import java.util.ArrayList;

public class Bayern implements FootballClub{
    @Override
    public String stadium() {
        return "Allianz Arena";
    }

    @Override
    public String coach() {
        return "Thomas Tuchel";
    }

    @Override
    public ArrayList<String> playersInfo() {
        ArrayList<String> bayernPlayers = new ArrayList<>();
        bayernPlayers.add(0, "Manuel Neuer");
        bayernPlayers.add(1, "Dayot Upamecano");
        bayernPlayers.add(2, "Minjae Kim");
        bayernPlayers.add(3, "Alphonso Davies");
        bayernPlayers.add(4, "Matthijs De Ligt");
        bayernPlayers.add(5, "Joshua Kimmich");
        bayernPlayers.add(6, "Jamal Musiala");
        bayernPlayers.add(7, "Serge Gnabry");
        bayernPlayers.add(8, "Harry Kane");
        bayernPlayers.add(9, "Leroy Sane");
        bayernPlayers.add(10, "Thomas Muller");

        return bayernPlayers;
    }

    public static void main(String[] args) {
        System.out.println("The list of players : " + new Bayern().playersInfo());
    }
}
