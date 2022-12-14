package org.example.examClouds.Lesson10.homework.fruits;

public abstract class Fruit {
   public int weight;

    public void printManufacturerInfo() {
        System.out.print("Made in Ukraine");
    }



    abstract void fruitPrice(double price, double weight);
}
