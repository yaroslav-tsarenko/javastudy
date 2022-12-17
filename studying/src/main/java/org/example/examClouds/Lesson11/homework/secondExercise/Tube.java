package org.example.examClouds.Lesson11.homework.secondExercise;

public class Tube implements Instrument{
    private int diameter;

    public Tube(int diameter) {
        this.diameter = diameter;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public void play() {
        System.out.println("Playing... Tube " + diameter);
    }
}
