package org.example.examClouds.Lesson10.homework.flowers;

public class Flower {
    private String manufacturer;
    private int suitability;
    private int price;
    static int count;

    public Flower(String manufacturer, int suitability, int price) {
        this.manufacturer = manufacturer;
        this.suitability = suitability;
        this.price = price;
        count++;
    }


    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getSuitability() {
        return suitability;
    }

    public void setSuitability(int suitability) {
        this.suitability = suitability;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
