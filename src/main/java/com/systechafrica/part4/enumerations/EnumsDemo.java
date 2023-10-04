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

        // using switch statements with enums
        Month[] monthsOftheYear = Month.values();
        for (Month m : monthsOftheYear) {
            switch (m) {
                case JANUARY:
                    System.out.println("January is the first month of the year");
                    break;
                case FEBRUARY:
                    System.out.println("February is the second month of the year");
                    break;
                case MARCH:
                    System.out.println("March is the third month of the year");
                    break;
                case APRIL:
                    System.out.println("April is the fourth month of the year");
                    break;
                case MAY:
                    System.out.println("May is the fifth month of the year");
                    break;
                case JUNE:
                    System.out.println("June is the sixth month of the year");
                    break;
                case JULY:
                    System.out.println("July is the seventh month of the year");
                    break;
                case AUGUST:
                    System.out.println("August is the eighth month of the year");
                    break;
                case SEPTEMBER:
                    System.out.println("September is the ninth month of the year");
                    break;
                case OCTOBER:
                    System.out.println("October is the tenth month of the year");
                    break;
                case NOVEMBER:
                    System.out.println("November is the eleventh month of the year");
                    break;
                case DECEMBER:
                    System.out.println("December is the twelfth month of the year");
                    break;
                default:
                    System.out.println("Invalid month");
                    break;
            }
        }
    }
    public static void main(String[] args) {
        EnumsDemo.seasonFunctions();
        EnumsDemo.monthFunctions();

    }
}
