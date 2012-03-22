package org.kodejava.example.text;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDate {
    public static void main(String[] args) {
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");

        try {
            Date today = df.parse("20/12/2005");
            System.out.println("Today = " + df.format(today));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
