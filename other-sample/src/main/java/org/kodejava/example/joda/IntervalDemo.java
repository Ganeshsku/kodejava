package org.kodejava.example.joda;

import org.joda.time.DateTime;
import org.joda.time.Duration;
import org.joda.time.Interval;
import org.joda.time.Months;

public class IntervalDemo {
    public static void main(String[] args) {
        DateTime startDate = new DateTime();
        DateTime endDate = startDate.plus(Months.months(2));

        //
        // Creates an interval from a start to an end instant.
        //
        Interval interval = new Interval(startDate, endDate);
        System.out.println("Interval = " + interval);
        System.out.println("Start    = " + interval.getStart());
        System.out.println("End      = " + interval.getEnd());

        //
        // Add one more month to the interval
        //
        interval = interval.withEnd(interval.getEnd().plusMonths(1));
        System.out.println("Interval = " + interval);

        //
        // Gets the duration of this time interval
        //
        Duration duration = interval.toDuration();
        System.out.println("Duration = " + duration);
    }
}
