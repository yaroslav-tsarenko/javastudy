package org.example.examClouds.Lesson10.homework.flowers;

public class Rose extends Flower{
    static int count;
    public Rose(String manufacturer, int suitability, int price) {
        super(manufacturer, suitability, price);
        count++;
    }
}
