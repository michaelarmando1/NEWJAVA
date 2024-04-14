package com.michael.newjava.O_O_P.Abstraction;

import java.util.ArrayList;

public class Chelsea implements FootballClub{
    @Override
    public String stadium() {
        return "Stamford Bridge";
    }

    @Override
    public String coach() {
        return "Mauricio Pocchettino";
    }

    @Override
    public ArrayList<String> playersInfo() {
        ArrayList<String> chelseaPlayers = new ArrayList<>();
        chelseaPlayers.add(0, "Robert Sanchez");
        chelseaPlayers.add(1, "Axel Disasi");
        chelseaPlayers.add(2, "Marc Cucurella");
        chelseaPlayers.add(3, "Reece James");
        chelseaPlayers.add(4, "Thiago Silva");
        chelseaPlayers.add(5, "Enzo Fernandez");
        chelseaPlayers.add(6, "Conor Gallagher");
        chelseaPlayers.add(7, "Moises Caicedo");
        chelseaPlayers.add(8, "Raheem Sterling");
        chelseaPlayers.add(9, "Mykhailo Mudryk");
        chelseaPlayers.add(10, "Nicolas Jackson");

        return chelseaPlayers;


    }

    public static void main(String[] args) {
        System.out.println("The list of players : " + new Chelsea().playersInfo());
    }
}
