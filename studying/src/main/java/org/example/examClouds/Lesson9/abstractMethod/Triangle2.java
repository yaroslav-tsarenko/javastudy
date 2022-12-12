package org.example.examClouds.Lesson9.abstractMethod;

public class Triangle2 extends Figure2 {
    public Triangle2(double dimension1, double dimension2) {
        super(dimension1, dimension2);
    }

    public double calculateArea() {
        System.out.println("In triangle area.");
        return dimension1 * dimension2 / 2;
    }
}
