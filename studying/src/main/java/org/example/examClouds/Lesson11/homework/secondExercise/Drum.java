package org.example.examClouds.Lesson11.homework.secondExercise;

public class Drum implements Instrument{
    private int size;

    public Drum(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public void play(){
        System.out.println("Playing... Drum " + size);
    }
}
