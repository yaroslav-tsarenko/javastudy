package org.example.examClouds.Lesson18.homework;

import org.example.examClouds.Lesson9.homework.Shop.Product;

import java.util.HashMap;
import java.util.Map;

public class MapCollection {
    public static void main(String[] args) {
        Map<Product, String> hashMap = new HashMap<>();
        Product car = new Product("Car", 400, "Perfect");
        Product doll = new Product("doll", 200, "Perfect");
        Product bear = new Product("bear", 300, "Perfect");

        hashMap.put(car, "Cars");
        hashMap.put(doll, "Dolly doll");
        hashMap.put(bear, "Teddy Bear");

        System.out.println(hashMap.entrySet());
        System.out.println(hashMap.keySet());
        System.out.println(hashMap.values());

    }
}
