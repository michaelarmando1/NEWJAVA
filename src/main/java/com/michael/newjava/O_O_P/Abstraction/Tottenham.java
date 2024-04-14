package com.michael.newjava.O_O_P.Abstraction;

import java.util.ArrayList;

public class Tottenham implements FootballClub{
    @Override
    public String stadium() {
        return "London Stadium";
    }

    @Override
    public String coach() {
        return "Ange Postecoglou";
    }

    @Override
    public ArrayList<String> playersInfo() {
        ArrayList<String> tottenhamPlayers = new ArrayList<>();
        tottenhamPlayers.add(0, "Hugo Lloris");
        tottenhamPlayers.add(1, "Emerson Royal");
        tottenhamPlayers.add(2, "Cristian Romero");
        tottenhamPlayers.add(3, "Eric Dier");
        tottenhamPlayers.add(4, "Destiny Udogie");
        tottenhamPlayers.add(5, "Ivan Perisic");
        tottenhamPlayers.add(6, "Rodrigo Bentancur");
        tottenhamPlayers.add(7, "Yves Bissouma");
        tottenhamPlayers.add(8, "James Maddison");
        tottenhamPlayers.add(9, "Richarlison");
        tottenhamPlayers.add(10, "Son Heung-Min");

        return tottenhamPlayers;
    }

    public static void main(String[] args) {
        System.out.println("The list of players : " + new Tottenham().playersInfo());
    }
}
