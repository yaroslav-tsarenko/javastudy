package org.example.enumerations;

public enum Season {
    SUMMER(35), WINTER(-15), AUTUMN(10), SPRING(20);

    private int temperature;

    Season(int temperature) {
        this.temperature = temperature;
    }
    public int getTemperature(){
        return temperature;
    }
}
