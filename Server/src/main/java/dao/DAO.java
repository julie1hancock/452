package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DAO {
    private Connection conn;

    public void openConnection() {
        if(conn != null){
            System.out.println("already open");
            return;
        }


        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Where is your MySQL JDBC Driver?");
            e.printStackTrace();
            return;
        }
        System.out.println("MySQL JDBC Driver Registered!");
        String HOST = "database-2.cuzlje9vqzhc.us-east-2.rds.amazonaws.com";
        String PORT = "3306";
        String DATABASE = "mydatabase";
        String REMOTE_DATABASE_USERNAME = "admin";
        String DATABASE_USER_PASSWORD = "coolpassword";

        String URL = String.format("jdbc:mysql://%s:%s/%s?user=%s&password=%s", HOST, PORT, DATABASE, REMOTE_DATABASE_USERNAME, DATABASE_USER_PASSWORD);
        try {
            conn = DriverManager.getConnection(URL);
        } catch (SQLException e) {
            System.out.println("Connection Failed!:\n" + e.getMessage());
        }

        if (conn == null) {
            System.out.println("FAILURE! Failed to make connection!");
        }

    }

//    public void closeConnection(boolean commit) {
//        try {
//            if (commit) {
//                conn.commit();
//            } else {
//                conn.rollback();
//            }
//            conn.close();
//            conn = null;
//        } catch (SQLException e) {
//            e.printStackTrace();
//            throw new Error("Unable to close database connection");
//        }
//    }

    public Connection getConnection() {
        if(conn == null) throw new NullPointerException("Trying to get null connection!");
        return conn;
    }
}
