package org.example.examClouds.Lesson10.homework.flowers;

public class Carnation extends Flower{
    static int count;
    public Carnation(String manufacturer, int suitability, int price) {
        super(manufacturer, suitability, price);
        count++;
    }
}
