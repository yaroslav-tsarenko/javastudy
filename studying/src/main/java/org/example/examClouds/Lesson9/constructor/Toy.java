package org.example.examClouds.Lesson9.constructor;

public class Toy {
    String name;
    int cost;
    String manufacturer;
    int age;

    public Toy(String name, int cost, String manufacturer, int age) {
        this(name, cost, manufacturer);
        this.age = age;
        System.out.println("In constructor with 4 parameters");
    }

    public Toy(String name, int cost, String manufacturer) {
        this();
        this.name = name;
        this.cost = cost;
        this.manufacturer = manufacturer;
        System.out.println("In constructor with 3 parameters");
    }

    public Toy() {
        System.out.println("In constructor with default");
    }
}
