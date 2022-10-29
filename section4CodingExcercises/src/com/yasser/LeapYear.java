package com.yasser;

public class LeapYear {
    public static boolean isLeapYear(int year) {
        //DIVIDABLE BY 4 BUT NOT 100 = True
        //DIVIDABLE BY 400 = TRUE
        return (year > 1 && year < 9999) && ((year%400 == 0) || ((year % 4 == 0) && (year % 100!= 0)));
    }
}
