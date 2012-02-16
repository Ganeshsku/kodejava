package org.kodejava.example.text;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class WithTimezoneStringToDate {
    public static void main(String[] args) {
        //
        // Create a DateFormat and set the timezone to GMT.
        //
        DateFormat df = new SimpleDateFormat("E, dd MMM yyyy HH:mm:ss z");
        df.setTimeZone(TimeZone.getTimeZone("GMT"));

        try {
            //
            // Convert string into Date
            //
            Date today = df.parse("Sun, 12 Feb 2012 00:00:00 GMT");
            System.out.println("Today = " + df.format(today));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
