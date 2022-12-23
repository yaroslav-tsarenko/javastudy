package org.example.examClouds.Lesson15.homework;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class ScheduleOfCelebrities {
    public static void main(String[] args) {
        LocalDate newYear = LocalDate.of(2023, Month.JANUARY, 1);
        LocalDate christmas = LocalDate.of(2022, Month.DECEMBER, 25);
        LocalDate easter = LocalDate.of(2023, Month.APRIL, 16);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        System.out.println("New Year: " + newYear.format(formatter) + '\n' +
                "Christmas: " + christmas.format(formatter) + '\n' +
                "Easter: " + easter.format(formatter));
    }
}
