package com.michael.newjava.JDBC;

public class Club {

    private String clubName;

    private String clubManager;

    public Club(String clubName, String clubManager) {
        this.clubName = clubName;
        this.clubManager = clubManager;
    }

    public String getClubName() {
        return clubName;
    }

    public String getClubManager() {
        return clubManager;
    }
}
