package com.systechafrica.part4.utilDates;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.TimeZone;

public class WorkingWithInstant {
    public static void main(String[] args) {
        Instant now = Instant.now();
        System.out.println("instant: " + now);
        System.out.println("now.getEpochSecond(): " + LocalDateTime.now());
        System.out.println("now.getEpochSecond(): " + now.getEpochSecond());

        TimeZone tz = TimeZone.getDefault();
        System.out.println("tz: " + tz);
        System.out.println("tz.getID(): " + tz.getID());
        System.out.println("tz.getDisplayName(): " + tz.getDisplayName());

    }
}
