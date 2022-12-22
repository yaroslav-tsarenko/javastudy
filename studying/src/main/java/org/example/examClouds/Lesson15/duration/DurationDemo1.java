package org.example.examClouds.Lesson15.duration;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class DurationDemo1 {
    public static void main(String[] args) {
        Duration oneDay = Duration.ofDays(1);
        Duration oneHour = Duration.ofMinutes(60);
        Duration oneMin = Duration.ofSeconds(60);
        Duration tenSeconds = Duration.ofSeconds(10);
        Duration twoSeconds = Duration.ofSeconds(1, 1_000_000_000);
        Duration oneSecondFromMillis = Duration.ofMillis(1);
        Duration oneSecondFromNanos = Duration.ofNanos(1000000000);
        Duration oneSecond = Duration.of(1, ChronoUnit.SECONDS);

        System.out.println("oneDay: " + oneDay);
        System.out.println("oneHour: " + oneHour);
        System.out.println("oneMin: " + oneMin);
        System.out.println("tenSeconds: " + tenSeconds);
        System.out.println("twoSeconds: " + twoSeconds);
        System.out.println("oneSecondFromMillis: "+oneSecondFromMillis);
        System.out.println("oneSecondFromNanos: "+oneSecondFromNanos);
        System.out.println("oneSecond: "+oneSecond);
    }
}

