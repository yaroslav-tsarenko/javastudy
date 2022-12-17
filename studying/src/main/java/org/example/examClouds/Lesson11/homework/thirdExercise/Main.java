package org.example.examClouds.Lesson11.homework.thirdExercise;

import org.example.enumerations.Season;

public class Main implements Description{
    public static void main(String[] args) {
        Main seasons = new Main();
        MyFavSeason favSeason = new MyFavSeason();
        favSeason.setFavSeason("Spring");
        System.out.println(favSeason.getFavSeason());
        season(Season.WINTER);
        seasons.getDescription(Season.SUMMER);


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
    
    public static void printAllSeason(){
        for (Season s: Season.values()) {
            System.out.println(s);
        }
    }


    @Override
    public void getDescription(Season season) {
        switch (season){
            case WINTER -> System.out.println("It's cold");
            case AUTUMN -> System.out.println("It's wet");
            case SPRING -> System.out.println("It's warm");
            case SUMMER -> System.out.println("It's hot");
        }
    }

    @Override
    public void getDescription(org.example.examClouds.Lesson11.homework.thirdExercise.Season season) {

    }
}
