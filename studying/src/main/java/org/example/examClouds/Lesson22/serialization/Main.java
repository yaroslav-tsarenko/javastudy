package org.example.examClouds.Lesson22.serialization;

import org.example.examClouds.Lesson9.superMethod.C;

import java.io.InvalidObjectException;

public class Main {
    public static void main(String[] args) {
    /*    Cat cat = new Cat();
        cat.setName("Tom");
        Serialization serialization = new Serialization();
        System.out.println(serialization.serialization(cat));*/

        Serialization serialization = new Serialization();
        try {
           Cat cat = serialization.deserialization();
            System.out.println(cat.getName());
        } catch (InvalidObjectException e) {
            throw new RuntimeException(e);
        }
    }
}
