package org.example.examClouds.Lesson11.homework.secondExercise;

public class Guitar implements Instrument{
    private int amountOfChords;

    public Guitar(int amountOfChords) {
        this.amountOfChords = amountOfChords;
    }

    public int getAmountOfChords() {
        return amountOfChords;
    }

    public void setAmountOfChords(int amountOfChords) {
        this.amountOfChords = amountOfChords;
    }

    @Override
    public void play() {
        System.out.println("Playing... Guitar " + amountOfChords);
    }
}
