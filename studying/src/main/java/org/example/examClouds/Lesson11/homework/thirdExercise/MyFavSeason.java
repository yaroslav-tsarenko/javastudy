package org.example.examClouds.Lesson11.homework.thirdExercise;

public class MyFavSeason {

    private String favSeason;

    public MyFavSeason(){

    }

    public MyFavSeason(String favSeason) {
        this.favSeason = favSeason;
    }

    public String getFavSeason() {
        System.out.print("My favorite season is: ");
        return favSeason;
    }

    public void setFavSeason(String favSeason) {
        this.favSeason = favSeason;
    }
}
