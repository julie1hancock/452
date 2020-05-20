package dao;

import java.util.List;

import models.Financial;

/**
 * talks directly to Financial table in our SQL
 */
public class FinancialDAO{

    /**
     * inserts single tuple/row into Financial table
     * @param model - row to insert
     * @return success
     */
    public boolean insert(Financial model) {
        return false;
    }

    /**
     * Find financial row w/ matching
     * @param financialID
     * @return [Financial] model with matching financialID or null if doesn't exist
     */
    public Financial read(String financialID) {
        return null;
    }

    /**
     * Delete financial row w/ matching
     * @param financialID
     * @return success
     */
    public boolean delete(String financialID) {
        return false;
    }

    /**
     * inserts many tuple/row into Financial table
     * @param models - list of rows to insert
     * @return success
     */
    public boolean insertMany(List<Financial> models) {
        return false;
    }

    /**
     * Execute given query on financial table
     * @param sqlQuery - query to be executed
     * @return list of [Financial] models in the ResultSet of the given query
     */
    public List<Financial> executeQuery(String sqlQuery) {
        return null;
    }
}