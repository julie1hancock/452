package dao;

import java.util.List;

import models.Rental;

/**
 * talks directly to Rental table in our SQL
 */
public class RentalDAO{

    /**
     * inserts single tuple/row into Rental table
     * @param model - row to insert
     * @return success
     */
    public boolean insert(Rental model) {
        return false;
    }

    /**
     * Find rental row w/ matching
     * @param rentalID
     * @return [Rental] model with matching rentalID or null if doesn't exist
     */
    public Rental read(String rentalID) {
        return null;
    }

    /**
     * Delete rental row w/ matching
     * @param rentalID
     * @return success
     */
    public boolean delete(String rentalID) {
        return false;
    }

    /**
     * inserts many tuple/row into Rental table
     * @param models - list of rows to insert
     * @return success
     */
    public boolean insertMany(List<Rental> models) {
        return false;
    }

    /**
     * Execute given query on rental table
     * @param sqlQuery - query to be executed
     * @return list of [Rental] models in the ResultSet of the given query
     */
    public List<Rental> executeQuery(String sqlQuery) {
        return null;
    }
}