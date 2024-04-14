package com.michael.newjava.JDBC;

import java.sql.SQLException;

public class ClubController {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {


        Club club1 = new Club("Chelsea", "Lampard");
        Club club2 = new Club("Arsenal", "Lewandoski");
        Club club3 = new Club("Spurs", "Andrew");

        DAO dao = new DAO();
        dao.saveClub(club1);
        dao.saveClub(club2);
        dao.saveClub(club3);
        dao.deleteClub("Arsenal");


        dao.viewClubs();
    }

}
