package com.systechafrica.part4.utilDates;

import java.util.Calendar;
import java.util.Date;

public class WorkingWithDates {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
    }
}
