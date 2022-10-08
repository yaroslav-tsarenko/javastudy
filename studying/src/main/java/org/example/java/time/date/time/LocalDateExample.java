package org.example.java.time.date.time;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.time.Month;

public class LocalDateExample {
   /* public static void main(String[] args) {
        LocalDate ld1 = LocalDate.now();
        LocalDate ld2 = LocalDate.of(2021,04,12);
        ld1 = ld1.plusDays(1);
        System.out.println(ld1);
    }*/

 /*   public static void main(String[] args) {
        LocalDate ld1 = LocalDate.now();
        LocalDate ld2 = LocalDate.of(2021,05,04);
        System.out.println(ChronoUnit.MONTHS.between(ld2, ld1));

    }*/
/*
    public static void main(String[] args) {
        LocalTime ld1 = LocalTime.parse("8:30");
        LocalTime ld2 = LocalTime.parse("9:30");
        System.out.println(ChronoUnit.MINUTES.between(ld2, ld1));
    }*/

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        for (int i = 0; i <= 1000; i++) {
            System.out.println(Math.random() * 10);
        }
        double finish = System.currentTimeMillis() - start;
        System.out.println(finish / 1000);
    }
}
