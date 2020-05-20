package main;

import java.sql.Date;
import java.util.Calendar;
import java.util.UUID;

import dao.DAO;
import dao.PostingDAO;
import models.Posting;

public class Main{
    public static void main(String[] args) {
        System.out.println("----------------------------------------------------------------MAIN START----------------------------------------------------------------");
        DAO dao = new DAO();
        Posting p = new Posting("postingID111", "addressId111",new Date(15, Calendar.APRIL,2010));
        PostingDAO postingDAO = new PostingDAO();
        dao.openConnection();
//        boolean success = postingDAO.createTable(dao.getConnection());
//        boolean success = postingDAO.insert(p, dao.getConnection());
        Posting p1 = postingDAO.read("postingID111", dao.getConnection());
        boolean success = postingDAO.delete("postingID111", dao.getConnection());
        Posting p2 = postingDAO.read("postingID111", dao.getConnection());
        System.out.println("----------------------------------------------------------------MAIN END----------------------------------------------------------------");
    }



}