package com.teachmeskills.lesson21.hw.task1;

import org.joda.time.DateTime;
import org.joda.time.Days;

public class JodaDateTime {

    public static int getDifferenceBetweenDates(int yearFrom, int monthFrom, int dayForm, int yearTo, int monthTo, int dayTo) {
        DateTime startDate = new DateTime(yearFrom, monthFrom, dayForm, 0, 0);
        DateTime endDate = new DateTime(yearTo, monthTo, dayTo, 0, 0);
        int daysDifference = Days.daysBetween(startDate, endDate).getDays();
        return daysDifference;
    }
}
