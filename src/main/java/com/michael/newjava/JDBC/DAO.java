package com.michael.newjava.JDBC;

import java.sql.*;

//public class DAO {
//    public static void main(String[] args) throws ClassNotFoundException, SQLException {
//        // step 1 Input your JDBC Driver
//        Class.forName("com.mysql.cj.jdbc.Driver");
//
//        String sqlQuery = "insert into products(Product_ID, Product_Name, Product_Category, Product_Price) values(?,?,?,?)";
//        // step 2: create a connection with the connection class
//        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/EVENT_ATTENDEES?serverTimezone=UTC", "root", "Mikeokoh.157");
//        PreparedStatement ps = con.prepareStatement(sqlQuery);
//        ps.setInt(1, 1);
//        ps.setString(2, "Michael");
//        ps.setString(3, "vvip");
//        ps.setInt(4, 3000);
//
//        ps.executeUpdate();
//
//    }
//
//    public void getUserFromDb() throws SQLException, ClassNotFoundException {
//        Class.forName("com.mysql.cj.jdbc.Driver");
//
//        String sqlToGetUser = "select * from users";
//
//        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/footBallDB?serverTimezone=UTC", "root", "Mikeokoh.157");
//        Statement ps = con.createStatement();
//        ResultSet rs = ps.executeQuery(sqlToGetUser);
//
//        while (rs.next()) {
//            int id = rs.getInt("USER_ID");
//            String firstName = rs.getString("FIRST_NAME");
//            String lastName = rs.getString("LAST_NAME");
//            String course = rs.getString("COURSE");
//            String courseDes = rs.getString("COURSE DESCRIPTION");
//            ArrayList<String> user = new ArrayList<>();
//
//            user.add(String.valueOf(id));
//            user.add(firstName);
//            user.add(lastName);
//            user.add(course);
//            user.add(courseDes);
//
//            System.out.println(user);
//        }
//    }
//
//}

public class DAO {
    public void saveClub(Club club) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String sqlQuery = "insert into club(club_name,club_manager) values (?,?)";
        String url = "jdbc:mysql://localhost:3306/footballDB?serverTimezone=UTC";
        Connection connection = DriverManager.getConnection(url, "root","Mikeokoh.157");
        PreparedStatement ps = connection.prepareStatement(sqlQuery);
        ps.setString(1, club.getClubName());
        ps.setString(2, club.getClubManager());
        ps.execute();
    }

    public void viewClubs() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/footballDB?serverTimezone=UTC";
        Connection connection = DriverManager.getConnection(url, "root","Mikeokoh.157");
        Statement st = connection.createStatement();
        ResultSet resultSet = st.executeQuery("select * from club;");
        while(resultSet.next()){
            int id = resultSet.getInt("id");
            String clubName = resultSet.getString("club_name");
            String clubManager = resultSet.getString("club_manager");

            System.out.println(id+"-> "+clubName+" : "+clubManager);
        }
    }
    public void deleteClub(String club_to_delete) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String sqlQuery = "DELETE FROM club WHERE club_name = ?";
        String url = "jdbc:mysql://localhost:3306/footballDB?serverTimezone=UTC";
        Connection connection = DriverManager.getConnection(url, "root","Mikeokoh.157");
        PreparedStatement ps = connection.prepareStatement(sqlQuery);
        ps.setString(1,club_to_delete);
        ps.execute();
    }

    public void updateClub() throws SQLException, ClassNotFoundException{
        Class.forName("com.mysql.cj.jdbc.Driver");
        String sqlQuery = "UPDATE club SET club_name = 'Manchester United', club_manager = 'Erik Ten Haag' WHERE id = 1";
        String url = "jdbc:mysql://localhost:3306/footballDB?serverTimezone=UTC";
        Connection con = DriverManager.getConnection(url, "root", "Mikeokoh.157");
        PreparedStatement ps = con.prepareStatement(sqlQuery);
        ps.execute();

    }

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        DAO dao = new DAO();
        dao.viewClubs();
        dao.deleteClub("Tottenham");
//        dao.updateClub();



    }
}
