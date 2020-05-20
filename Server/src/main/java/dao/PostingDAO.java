package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import models.Posting;

/**
 * talks directly to Posting table in our SQL
 */
public class PostingDAO{

    public boolean createTable(Connection c){
        assert c != null;
        String createTableStmt = "CREATE TABLE IF NOT EXISTS Posting(" +
                "postingID VARCHAR(256) NOT NULL,\n" +
                "addressID VARCHAR(256) NOT NULL,\n" +
                "datePosted DATE NOT NULL,\n" +
                "PRIMARY KEY ( postingID )\n" +
                ");";

        try {
            Statement statement = c.createStatement();
            statement.executeUpdate(createTableStmt);
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public boolean deleteTable(Connection c){
        assert c != null;
        String createTableStmt = "DROP TABLE Posting";

        try {
            Statement statement = c.createStatement();
            statement.executeUpdate(createTableStmt);
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }


    /**
     * inserts single tuple/row into Posting table
     * @param model - row to insert
     * @return success
     */
    public boolean insert(Posting model, Connection c) {
        assert model.isValid();
        assert c != null;
        String insertStatement = String.format("INSERT INTO Posting " +
                "(postingID, addressID, datePosted)" +
                "VALUES ('%s','%s','%s')", model.getPostingID(), model.getAddressID(), model.getDatePosted());
        try {
            Statement statement = c.createStatement();
            statement.execute(insertStatement);
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    /**
     * Find posting row w/ matching
     * @param postingID
     * @return [Posting] model with matching postingID or null if doesn't exist
     */
    public Posting read(String postingID, Connection c) {
        assert postingID != null && !postingID.isEmpty();
        assert c != null;
        String readStatement = String.format(
                "SELECT * " +
                "FROM Posting " +
                "WHERE postingID = '%s';", postingID
        );

        Posting p = null;
        try {
            Statement statement = c.createStatement();
            ResultSet rs = statement.executeQuery(readStatement);
            if(rs.next()){
                p = new Posting();
                p.setPostingID(rs.getString("postingID"));
                p.setAddressID(rs.getString("addressID"));
                p.setDatePosted(rs.getDate("datePosted"));
            } else { throw new SQLException("no matching row found in Posting"); }
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
        return p;
    }

    /**
     * Delete posting row w/ matching
     * @param postingID
     * @return success
     */
    public boolean delete(String postingID, Connection c) {
        assert postingID != null && !postingID.isEmpty();
        assert c != null;
        String deleteStatement = String.format("DELETE FROM Posting " +
                "WHERE postingID = '%s';", postingID);
        try {
            Statement statement = c.createStatement();
            statement.execute(deleteStatement);
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    /**
     * inserts many tuple/row into Posting table
     * @param models - list of rows to insert
     * @return success
     */
    public boolean insertMany(List<Posting> models, Connection c) {
        boolean flag = true;
        for (Posting model : models) {
            if(!insert(model, c)) {
                flag = false;
            }
        }
        return flag;
    }

    public List<Posting> getPostingsBetweenDates(Date firstDate, Date secondDate, Connection c){
        assert firstDate != null && secondDate != null;
        assert c != null;
        String query = String.format("SELECT * FROM Posting WHERE datePosted >= '%s' AND datePosted <= '%s';", firstDate, secondDate);


        List<Posting> postings = new ArrayList<>();
        try {
            Statement statement = c.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while(rs.next()){
                Posting p = new Posting();
                p.setPostingID(rs.getString("postingID"));
                p.setAddressID(rs.getString("addressID"));
                p.setDatePosted(rs.getDate("datePosted"));
                postings.add(p);
            }
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
        return postings;
    }

}