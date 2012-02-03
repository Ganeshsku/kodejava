package org.kodejava.example.joda;

import org.joda.time.DateTime;

import java.util.Locale;

public class FormattingDemo {
    //
    // Define the date format pattern.
    //
    private static final String pattern = "E MM/dd/yyyy HH:mm:ss.SSS";

    public static void main(String[] args) {
        //
        // Creates a new instance of DateTime object.
        //
        DateTime dateTime = new DateTime();

        //
        // Print out the date as a formatted string using the defined
        // Locale information.
        //
        System.out.println(dateTime.toString(pattern));
        System.out.println(dateTime.toString(pattern, Locale.GERMANY));
        System.out.println(dateTime.toString(pattern, Locale.FRENCH));
        System.out.println(dateTime.toString(pattern, Locale.JAPANESE));
    }
}
