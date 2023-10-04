package com.systechafrica.part4.enumerations;

import com.systechafrica.part4.enumerations.Seasons.Season;

public class EnumsDemo {
    public static void seasonFunctions(){
        // Get all values of Season as an array
        Season[] weather = Season.values(); 
        System.out.println(weather);

        // Get the season SPRING
        Season weather1 = Season.SPRING;
        System.out.println(weather1);

        // Get the season using the name
        Season season2 = Season.valueOf("SUMMER");
        System.out.println(season2);

        /* 
        * WHEN OBTAINING THE SEASON USING valueOf, the string parameter must be capitalised to avoid an IllegalArgumentException
        */

        //  using the ordinal() to access the position of an enum, counts from index 0 just like in arrays
        int springPosition = Season.AUTUMN.ordinal();
        System.out.println(springPosition);
    }

    public static void monthFunctions(){
        Month[] months = Month.values();
        System.out.println(months);

        Month month1 = Month.JANUARY;
        System.out.println(month1);

        Month month2 = Month.valueOf("FEBRUARY");
        System.out.println(month2);

        int monthPosition = Month.MARCH.ordinal();
        System.out.println(monthPosition);
    }
    public static void main(String[] args) {
        EnumsDemo.seasonFunctions();
        EnumsDemo.monthFunctions();

    }
}
