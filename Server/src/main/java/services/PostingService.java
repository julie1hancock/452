package services;

import java.sql.Date;
import java.util.List;

import dao.DAO;
import dao.PostingDAO;
import models.Posting;

public class PostingService {

    public static void insert(Posting p){
        DAO dao = new DAO();
        dao.openConnection();
        new PostingDAO().insert(p, dao);
    }

    public static void delete(String postingID){
        DAO dao = new DAO();
        dao.openConnection();
        new PostingDAO().delete(postingID, dao);
    }

    public static void insertMultiple(List<Posting> p){
        DAO dao = new DAO();
        dao.openConnection();
        new PostingDAO().insertMany(p, dao);
    }

    public static Posting read(String postingID){
        DAO dao = new DAO();
        dao.openConnection();
        return new PostingDAO().read(postingID, dao.getConnection());
    }

    public static List<Posting> readBetweenDates(Date firstDate, Date secondDate){
        DAO dao = new DAO();
        dao.openConnection();
        return new PostingDAO().getPostingsBetweenDates(firstDate, secondDate, dao.getConnection());
    }

}
