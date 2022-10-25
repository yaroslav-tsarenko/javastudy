package org.example.exersices.LearningJava.SeaBattle;

public class SimpleDotCom {
    int[] locationCells;
    int numOfHits = 0;

    public void setLocationCells(int[] locs){
        locationCells = locs;
    }

    public String checkYourSelf(String stringGuess){
        int guess = Integer.parseInt(stringGuess);
        String result = "Miss";
        for(int cell : locationCells){
            if (guess == cell){
                result = "Good shot";
                numOfHits++;
                break;
            }
        }
        if(numOfHits == locationCells.length){
            result = "Break down";
        }
        System.out.println(result);
        return result;
    }
}
