package org.example.examClouds.Lesson15.homework;

import org.example.examClouds.Lesson15.localDate.LocalDateDemo1;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class DateOfBirth {
    public static void main(String[] args) {
        LocalDate dateOfBirth = LocalDate.of(2005, Month.JANUARY, 23);
        DayOfWeek dayOfWeek = dateOfBirth.getDayOfWeek();
        LocalDate now = LocalDate.now();
        System.out.println(dateOfBirth + " " + dayOfWeek + '\n');
        boolean after = now.isAfter(dateOfBirth);
        boolean before = now.isBefore(dateOfBirth);
        boolean equal = now.equals(dateOfBirth);
        System.out.println(after + " " + '\n' + before + " " + '\n' + equal);




    }
}
