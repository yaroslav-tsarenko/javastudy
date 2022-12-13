package org.example.examClouds.Lesson9.homework.CarExercise.professions;

import org.example.examClouds.Lesson9.homework.PersonExercise.Person;

public class Driver extends Person {
    private String SFP;
    private int driveExperience;

    public Driver(String SFP, int driveExperience) {
        this.SFP = SFP;
        this.driveExperience = driveExperience;
    }

    public String getSFP() {
        return SFP;
    }

    public void setSFP(String SFP) {
        this.SFP = SFP;
    }

    public int getDriveExperience() {
        return driveExperience;
    }

    public void setDriveExperience(int driveExperience) {
        this.driveExperience = driveExperience;
    }
}
