package models;

public class DateMaker {

    public static java.sql.Date getDate(int year, int month, int day){
        year = year - 1900;
//        month = month - 1;
        //feb 1 2011

        if(day > 31) throw new Error("day value too high");
        if(month > 12) throw new Error("month value too high");
//        if(year > ) throw new Error("month value too high");


        return new java.sql.Date(year, month, day);
    }
}
