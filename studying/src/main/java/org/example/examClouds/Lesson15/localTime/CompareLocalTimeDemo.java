package org.example.examClouds.Lesson15.localTime;

import java.time.LocalTime;

public class CompareLocalTimeDemo {
    public static void main(String[] args) {
        LocalTime fiveThirty = LocalTime.of(5, 30);
        LocalTime noon = LocalTime.of(12, 0, 0);
        LocalTime almostMidnight = LocalTime.of(23, 59, 59, 999999);

        System.out.println("fiveThirty.isAfter(noon)? " + fiveThirty.isAfter(noon)); // false
        System.out.println("fiveThirty.isBefore(noon)? " + fiveThirty.isBefore(noon)); // true
        System.out.println("noon.equals(almostMidnight)? " + noon.equals(almostMidnight)); // false
    }
}
