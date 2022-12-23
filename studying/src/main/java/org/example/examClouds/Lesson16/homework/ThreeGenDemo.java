package org.example.examClouds.Lesson16.homework;

import org.example.examClouds.Lesson9.superMethod.C;

public class ThreeGenDemo {
    public static void main(String[] args) {
        ThreeGen<String, Cat, Integer> threeGen = new ThreeGen<>("str", new Cat(), 4);
        threeGen.showTypes();
        System.out.println(threeGen);

    }
}
