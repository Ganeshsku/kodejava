package org.kodejava.example.joda;

import org.joda.time.DateTime;

public class LastDayOfTheMonth {
    public static void main(String[] args) {
        //
        // Creates an instance of DateTime.
        //
        DateTime dateTime = new DateTime();

        //
        // Get the last date of the month using the dayOfMonth property
        // and get the maximum value from it.
        //
        DateTime lastDate = dateTime.dayOfMonth().withMaximumValue();

        //
        // Print the date and day name.
        //
        System.out.println("Date = " + lastDate.toString());
        System.out.println("Day  = " + lastDate.dayOfWeek().getAsText());
    }
}
