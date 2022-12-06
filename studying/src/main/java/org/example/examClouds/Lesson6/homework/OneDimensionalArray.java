package org.example.examClouds.Lesson6.homework;

public class OneDimensionalArray {
    public static void main(String[] args) {
        String [] dayOfWeek = new String[7];
        dayOfWeek[0] = "monday";
        dayOfWeek[1] = "tuesday";
        dayOfWeek[2] = "wednesday";
        dayOfWeek[3] = "thursday";
        dayOfWeek[4] = "friday";
        dayOfWeek[5] = "saturday";
        dayOfWeek[6] = "sunday";
        for (int i = 0; i < dayOfWeek.length; i++) {
            System.out.println(dayOfWeek[i]);
        }
        System.out.println(dayOfWeek[6]);
    }
}
