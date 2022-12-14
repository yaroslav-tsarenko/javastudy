package org.example.examClouds.Lesson10.homework.fruits;

public class Apricot extends Fruit{



    public void printManufacturerInfo() {
        System.out.print("Made in Ukraine");
    }

    @Override
    void fruitPrice(double price, double weight) {
        double kg = weight / 1000;
        double result = price / kg ;
        System.out.println(Math.round(result)+ " grn");
    }
}

