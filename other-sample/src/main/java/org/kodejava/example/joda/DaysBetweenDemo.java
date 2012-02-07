package org.kodejava.example.joda;

import org.joda.time.DateMidnight;
import org.joda.time.Days;

public class DaysBetweenDemo {
    public static void main(String[] args) {
        //
        // Define the start and end dates. We use the DateMidnight
        // class to make sure that the calculation start from the
        // midnight.
        //
        DateMidnight start = new DateMidnight("2010-02-01");
        DateMidnight end = new DateMidnight("2012-02-07");

        //
        // Get days between the start date and end date.
        //
        int days = Days.daysBetween(start, end).getDays();

        //
        // Print the result.
        //
        System.out.println("Days between " +
                start.toString("yyyy-MM-dd") + " and " +
                end.toString("yyyy-MM-dd") + " = " +
                days + " day(s)");
    }
}
