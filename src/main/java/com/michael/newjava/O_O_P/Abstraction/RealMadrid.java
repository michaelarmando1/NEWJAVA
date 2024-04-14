package com.michael.newjava.O_O_P.Abstraction;

import java.util.ArrayList;

public class RealMadrid implements FootballClub{
    @Override
    public String stadium() {
        return "Santiago Bernabeu";
    }

    @Override
    public String coach() {
        return "Carlo Ancelotti";
    }

    @Override
    public ArrayList<String> playersInfo() {
        ArrayList<String> realmadridPlayers = new ArrayList<>();
        realmadridPlayers.add(0, "Arrizabalaga");
        realmadridPlayers.add(1, "Carvajal");
        realmadridPlayers.add(2, "Alaba");
        realmadridPlayers.add(3, "Rudiger");
        realmadridPlayers.add(4, "E. Militao");
        realmadridPlayers.add(5, "Bellingham");
        realmadridPlayers.add(6, "Kroos");
        realmadridPlayers.add(7, "Modric");
        realmadridPlayers.add(8, "Vini Jr");
        realmadridPlayers.add(9, "Rodrygo");
        realmadridPlayers.add(10, "Tchouameni");

        return realmadridPlayers;
    }

    public static void main(String[] args) {
        System.out.println("The list of players : " + new RealMadrid().playersInfo());
    }
}
