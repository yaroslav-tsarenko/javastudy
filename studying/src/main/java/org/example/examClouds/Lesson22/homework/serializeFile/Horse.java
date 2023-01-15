package org.example.examClouds.Lesson22.homework.serializeFile;

import org.example.examClouds.Lesson16.homework.Animal;

import java.io.Serializable;

public class Horse extends Animal implements Serializable {

    private String name;
    private String breed;

    public Horse(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public String toString() {
        return "Horse{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                '}';
    }
}
