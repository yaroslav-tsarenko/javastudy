package org.example.examClouds.Lesson11.homework.thirdExercise;

import org.example.enumerations.Season;

public class Main {
    public static void main(String[] args) {
        MyFavSeason favSeason = new MyFavSeason();
        favSeason.setFavSeason("Spring");
        System.out.println(favSeason.getFavSeason());
        season(Season.WINTER);

    }

    public static void season(Season season){
        switch (season){
            case AUTUMN:
                System.out.println("I like autumn");
                break;
            case WINTER:
                System.out.println("I like winter");
                break;
            case SPRING:
                System.out.println("I like spring");
                break;
            case SUMMER:
                System.out.println("I like summer");
                break;
            default:
                System.out.println("You didn't input type of season");
        }

    }
}
