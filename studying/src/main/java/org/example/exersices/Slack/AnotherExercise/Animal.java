package org.example.exersices.Slack.AnotherExercise;

import java.util.Objects;

public class Animal {
    private String NameOfAnimal;
    private int AgeOfAnimal;
    private boolean AnimalsTail;

    public Animal(String nameOfAnimal, int ageOfAnimal, boolean animalsTail) {
        NameOfAnimal = nameOfAnimal;
        AgeOfAnimal = ageOfAnimal;
        AnimalsTail = animalsTail;

    }

    @Override
    public String toString() {
        return "Name: " +
                  NameOfAnimal +  ", " +
                "Age: " + AgeOfAnimal + ", " +
                "Tail: " + AnimalsTail;
    }


    @Override
    public int hashCode() {
        return Objects.hash(NameOfAnimal, AgeOfAnimal, AnimalsTail);
    }
}
