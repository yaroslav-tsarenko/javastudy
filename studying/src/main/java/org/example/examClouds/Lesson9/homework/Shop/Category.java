package org.example.examClouds.Lesson9.homework.Shop;

import org.example.examClouds.Lesson9.superMethod.C;
import org.example.oop.polimorphism.Cat;

import java.util.Arrays;

public class Category extends Product {

    public String name;
    private int[] products;


    public Category(String name, int price, int rating, int[] products) {
        super(name, price, String.valueOf(rating));

        this.products = products;
    }

    public Category(String name, int[] products, int[] products1) {
        super(name, products);
        this.products = products1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getProducts() {
        return products;
    }

    public void setProducts(int[] products) {
        this.products = products;
    }

}

