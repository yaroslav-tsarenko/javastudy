package org.example.examClouds.Lesson18.homework;

import java.util.HashMap;
import java.util.Map;

public class MainAnimals {
    private static Pet Cat;
    private static Pet Dog;
    private static Pet Parrot;

    public static void main(String[] args) {
        Cat cat = new Cat("Barsik");
        Dog dog = new Dog("Balik");
        Parrot parrot = new Parrot("Kesha");
        Map<String, Pet> map = new HashMap<>();
        map.put("Cat", cat);
        map.put("Dog", dog);
        map.put("Parrot", parrot);

        for (Map.Entry entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " Value: "
                    + entry.getValue());
        }
    }
}
