package dao;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import models.DateMaker;
import models.Posting;

import static org.junit.jupiter.api.Assertions.*;

class PostingDAOTest {

    private DAO dao = null;
    private PostingDAO postingDAO = null;

    @BeforeEach
    void setup() {
        dao = new DAO();
        postingDAO = new PostingDAO();
        dao.openConnection();
        postingDAO.deleteTable(dao);
        postingDAO.createTable(dao);
    }

    @AfterEach
    void tearDown() {
        dao = null;
        postingDAO = null;
    }

    @Test
    void insert_read() {
        Posting toInsert = new Posting("ID123", "ID345", DateMaker.getDate(2011, Calendar.FEBRUARY, 1));
        assertNull(postingDAO.read("ID123", dao.getConnection()));
        assertTrue(postingDAO.insert(toInsert, dao));
        Posting actual = postingDAO.read("ID123", dao.getConnection());
        assertNotNull(actual);
        assertEquals(toInsert, actual);
    }

    @Test
    void delete() {
        Posting toDelete = new Posting("ID123", "ID345", DateMaker.getDate(2011, Calendar.FEBRUARY, 1));
        //insert
        assertTrue(postingDAO.insert(toDelete, dao));
        //make sure its there
        assertEquals(toDelete, postingDAO.read("ID123", dao.getConnection()));
        //delete
        assertTrue(postingDAO.delete("ID123", dao));
        //make sure its not there now
        assertNull(postingDAO.read("ID123", dao.getConnection()));
    }

    @Test
    void insertMany(){
        List<Posting> postings = new ArrayList<>();
        Posting p1 = new Posting("ID1", "ID11", DateMaker.getDate(2011, Calendar.FEBRUARY, 1));
        Posting p2 = new Posting("ID2", "ID22", DateMaker.getDate(2012, Calendar.FEBRUARY, 4));
        Posting p3 = new Posting("ID3", "ID33", DateMaker.getDate(2013, Calendar.MARCH, 9));
        Posting p4 = new Posting("ID4", "ID44", DateMaker.getDate(2014, Calendar.APRIL, 16));
        Posting p5 = new Posting("ID5", "ID55", DateMaker.getDate(2015, Calendar.MAY, 25));
        postings.add(p1);
        postings.add(p2);
        postings.add(p3);
        postings.add(p4);
        postings.add(p5);

       //asserting none of the above are in the DB
        assertNull(postingDAO.read("ID1", dao.getConnection()));
        assertNull(postingDAO.read("ID2", dao.getConnection()));
        assertNull(postingDAO.read("ID3", dao.getConnection()));
        assertNull(postingDAO.read("ID4", dao.getConnection()));
        assertNull(postingDAO.read("ID5", dao.getConnection()));

        //insert all
        assertTrue(postingDAO.insertMany(postings, dao));

        //assert they are all there now!
        assertEquals(p1, postingDAO.read("ID1", dao.getConnection()));
        assertEquals(p2, postingDAO.read("ID2", dao.getConnection()));
        assertEquals(p3, postingDAO.read("ID3", dao.getConnection()));
        assertEquals(p4, postingDAO.read("ID4", dao.getConnection()));
        assertEquals(p5, postingDAO.read("ID5", dao.getConnection()));

    }

    @Test
    void getPostingsBetweenDates() {
        List<Posting> postings = new ArrayList<>();
        Posting p1 = new Posting("ID1", "ID11", DateMaker.getDate(2011, Calendar.FEBRUARY, 1));
        Posting p2 = new Posting("ID2", "ID22", DateMaker.getDate(2012, Calendar.FEBRUARY, 4));
        Posting p3 = new Posting("ID3", "ID33", DateMaker.getDate(2013, Calendar.MARCH, 9));
        Posting p4 = new Posting("ID4", "ID44", DateMaker.getDate(2014, Calendar.APRIL, 16));
        Posting p5 = new Posting("ID5", "ID55", DateMaker.getDate(2015, Calendar.MAY, 25));
        postings.add(p1);
        postings.add(p2);
        postings.add(p3);
        postings.add(p4);
        postings.add(p5);

        //insert all
        assertTrue(postingDAO.insertMany(postings, dao));

        List<Posting> expected = postingDAO.getPostingsBetweenDates(DateMaker.getDate(2010, Calendar.JANUARY, 1), DateMaker.getDate(2016, Calendar.JANUARY, 15), dao.getConnection());
        assertTrue(expected.contains(p1));
        assertTrue(expected.contains(p2));
        assertTrue(expected.contains(p3));
        assertTrue(expected.contains(p4));
        assertTrue(expected.contains(p5));


        //year
        expected = postingDAO.getPostingsBetweenDates(DateMaker.getDate(2012, Calendar.JANUARY, 1), DateMaker.getDate(2015, Calendar.JANUARY, 15), dao.getConnection());
        assertFalse(expected.contains(p1));
        assertTrue(expected.contains(p2));
        assertTrue(expected.contains(p3));
        assertTrue(expected.contains(p4));
        assertFalse(expected.contains(p5));

        //month
        expected = postingDAO.getPostingsBetweenDates(DateMaker.getDate(2012, Calendar.MARCH, 1), DateMaker.getDate(2015, Calendar.APRIL, 30), dao.getConnection());
        assertFalse(expected.contains(p1));
        assertFalse(expected.contains(p2));
        assertTrue(expected.contains(p3));
        assertTrue(expected.contains(p4));
        assertFalse(expected.contains(p5));

        //day
        expected = postingDAO.getPostingsBetweenDates(DateMaker.getDate(2012, Calendar.FEBRUARY, 5), DateMaker.getDate(2015, Calendar.MAY, 24), dao.getConnection());
        assertFalse(expected.contains(p1));
        assertFalse(expected.contains(p2));
        assertTrue(expected.contains(p3));
        assertTrue(expected.contains(p4));
        assertFalse(expected.contains(p5));
    }
}