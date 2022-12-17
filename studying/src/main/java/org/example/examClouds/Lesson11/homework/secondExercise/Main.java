package org.example.examClouds.Lesson11.homework.secondExercise;

public class Main {
    public static void main(String[] args) {
        Instrument[] instruments = new Instrument[3];
        instruments[0] = (Instrument) new Guitar(7);
        instruments[1] = (Instrument) new Drum(10);
        instruments[2] = (Instrument) new Tube(30);
        for (int i = 0; i < instruments.length; i++) {
            instruments[i].play();
        }
    }
}
