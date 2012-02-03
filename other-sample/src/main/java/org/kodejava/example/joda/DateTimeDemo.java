package org.kodejava.example.joda;

import org.joda.time.DateTime;

import java.util.Calendar;
import java.util.Date;

public class DateTimeDemo {

    public static void main(String[] args) {
        DateTime dateTime = null;

        //
        // Creates DateTime object using the default constructor will
        // give you the current system date.
        //
        dateTime = new DateTime();
        System.out.println("dateTime = " + dateTime);

        //
        // Creates DateTime object with information like year, month,
        // day, hour, minute, second and milliseconds
        //
        dateTime = new DateTime(2012, 2, 3, 0, 0, 0, 0);
        System.out.println("dateTime = " + dateTime);

        //
        // Create DateTime object from JDK's Date milliseconds.
        //
        Date date = new Date();
        dateTime = new DateTime(date.getTime());
        System.out.println("dateTime = " + dateTime);

        //
        // Create DateTime object from JDK's Date object.
        //
        date = new Date();
        dateTime = new DateTime(date);
        System.out.println("dateTime = " + dateTime);

        //
        // Create DateTime object from JDK's Calendar object.
        //
        Calendar calendar = Calendar.getInstance();
        dateTime = new DateTime(calendar);
        System.out.println("dateTime = " + dateTime);

        //
        // Create DateTime object from string. The format of the
        // string  should be precise.
        //
        dateTime = new DateTime("2012-02-03T14:15:00.000+08:00");
        System.out.println("dateTime = " + dateTime);
        dateTime = new DateTime("2012-02-03");
        System.out.println("dateTime = " + dateTime);
    }
}
