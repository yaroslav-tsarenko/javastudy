package org.example.exersices.LearningJava.SeaBattle;

import java.util.ArrayList;

public class DotCom {

    private ArrayList<String> locationCells;
    private String name;

    public void setLocationCells(ArrayList<String> loc) {
        locationCells = loc;
    }

    public void setName(String n){
        name = n;
    }

    public String checkYourSelf(String userInput) {
        String result = "Miss";
        int index = locationCells.indexOf(userInput);
        if (index >= 0) {
            locationCells.remove(index);
        }

        if (locationCells.isEmpty()) {
            result = "Break down";
        } else {
            result = "Hit";
        }
        return result;
    }
}
