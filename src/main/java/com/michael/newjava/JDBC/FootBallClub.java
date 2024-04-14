package com.michael.newjava.JDBC;

import java.sql.*;
import java.util.ArrayList;


public class FootBallClub {
    public void saveClubs() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        String sqlQuery = "INSERT INTO club(club_name, club_manager) VALUES (?, ? )";
        Connection con = DriverManager.getConnection("jdbc:mysql://footballDB/EVENT_ATTENDEES?serverTimezone=UTC", "root", "Mikeokoh.157");
        PreparedStatement ps = con.prepareStatement(sqlQuery);
        ps.setString(1, "Manchester United");
        ps.setString(2, "Erik Ten Haag");

        ps.execute();
    }

    public static void main(String[] args) {

    }
}
