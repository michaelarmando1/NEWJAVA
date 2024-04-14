package com.michael.newjava.O_O_P.Abstraction;

import java.util.ArrayList;

public class Barcelona implements FootballClub {
    @Override
    public String stadium() {
        return "Camp Nou";
    }

    @Override
    public String coach() {
        return "Xavi";
    }

    @Override
    public ArrayList<String> playersInfo() {
        ArrayList<String> barcelonaPlayers = new ArrayList<>();
        barcelonaPlayers.add(0, "Marc-Andre Ter Stegen");
        barcelonaPlayers.add(1, "Joao Cancelo");
        barcelonaPlayers.add(2, "Ronald Araujo");
        barcelonaPlayers.add(3, "Jules Kounde");
        barcelonaPlayers.add(4, "Alejandro Balde");
        barcelonaPlayers.add(5, "Gavi");
        barcelonaPlayers.add(6, "Ilkay Gundogan");
        barcelonaPlayers.add(7, "Pedri");
        barcelonaPlayers.add(8, "Joao Felix");
        barcelonaPlayers.add(9, "Robert Lewandowski");
        barcelonaPlayers.add(10, "Raphinha");

        return barcelonaPlayers;
    }

    public static void main(String[] args) {
        System.out.println("The list of players : " + new Barcelona().playersInfo());
    }
}
