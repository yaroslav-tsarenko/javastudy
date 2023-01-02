package org.example.examClouds.Lesson9.homework.Shop;

import java.util.Arrays;

public class Product {
    private String name;
    private int price;
    private int rating;
    private int[] products;

    public Product(String name, int price, int rating, int[] products) {
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.products = products;
    }

    public Product(String name, int[] products) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public Product(String name, int price, String rating) {
        super();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", rating=" + rating +
                ", products=" + Arrays.toString(products) +
                '}';
    }

    public void setCost(int i) {
    }
}
