package org.example.string.methods;

import java.util.Date;

public class StringDayOfWeekMonthAndDateMethod {
    public static void main(String[] args) {
        Date today = new Date();
        System.out.println(String.format("%tA %tB %tD", today, today, today));
    }
}
