package com.wip.automation.excercise4;

//Create a two past date using java date api

import java.util.Calendar;
import java.util.Date;

public class PastDateUsingDateAPI {

    public static void main(String[] args) {
        // Generate a date for Jan. 25, 2013, 10:11:15 AM
        Calendar cal = Calendar.getInstance();
        // YEAR, MONTH, DAY_OF_MONTH, HOUR_OF_DAY, MINUTE, and SECOND.
        cal.set(2013, Calendar.JANUARY, 25, 10, 11, 15);

        Date date1 = cal.getTime();
        System.out.println("The past date1 using java date api ===> " + date1);

        // Generate a date for October. 5, 1966, 12:55:15 AM

        // YEAR, MONTH, DAY_OF_MONTH, HOUR_OF_DAY, MINUTE, and SECOND.
        cal.set(1966, Calendar.OCTOBER, 5, 12, 55, 5);

        Date date2 = cal.getTime();
        System.out.println("The past date2 using java date api ===> " + date2);

    }

}
