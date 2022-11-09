package org.example.exersices.Slack.AnotherExercise;

public class MainClassDevice {
    public static void main(String[] args) {
        Device d1 = new Device("Samsung", 120f, "AB1234567CD");
        System.out.println(d1);
        Monitor m1 = new Monitor("Samsung", 120f, "AB1234567CD", 1280, 1024);
        System.out.println(m1);

    }
}
