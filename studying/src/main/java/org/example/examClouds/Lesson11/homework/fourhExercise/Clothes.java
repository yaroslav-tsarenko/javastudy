package org.example.examClouds.Lesson11.homework.fourhExercise;

public abstract class Clothes {
    private int size;
    private int price;
    private String color;

    public Clothes(int size, int price, String color) {
        this.size = size;
        this.price = price;
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Clothes: " +
                "size=" + size +
                ", price=" + price +
                ", color='" + color + '\'';
    }
}
