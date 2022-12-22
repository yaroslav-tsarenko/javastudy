package org.example.examClouds.Lesson15.period;

import java.time.LocalDate;
import java.time.Period;

public class PeriodDemo2 {
    public static void main(String[] args) {
        LocalDate march2003 = LocalDate.of(2003, 3, 1);
        LocalDate may2003 = LocalDate.of(2003, 5, 1);
        Period dif = Period.between(march2003, may2003);
        System.out.println(dif);
    }
}
