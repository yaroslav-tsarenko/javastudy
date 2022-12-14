package org.example.examClouds.Lesson10.homework.flowers;

public class Tulip extends Flower{
    static int count;
    public Tulip(String manufacturer, int suitability, int price) {
        super(manufacturer, suitability, price);
        count++;
    }
}
