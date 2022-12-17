package org.example.examClouds.Lesson11.homework.thirdExercise;

public enum Season {
    WINTER(-20), SPRING(15), SUMMER(25), AUTUMN(10);

    private int temperature;

    Season(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }



}
