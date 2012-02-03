package org.kodejava.example.joda;

import org.joda.time.DateMidnight;

import java.util.Date;

public class DateMidnightDemo {
    public static void main(String[] args) {
        //
        // Create DateMidnight object of the current system dateMidnight.
        //
        DateMidnight dateMidnight = new DateMidnight();
        System.out.println("dateMidnight = " + dateMidnight);

        //
        // Create DateMidnight object by year, month and day.
        //
        dateMidnight = new DateMidnight(2012, 1, 1);
        System.out.println("dateMidnight = " + dateMidnight);

        //
        // Create DateMidnight object from JDK's Date milliseconds.
        //
        Date date = new Date();
        dateMidnight = new DateMidnight(date.getTime());
        System.out.println("dateMidnight = " + dateMidnight);
    }
}
