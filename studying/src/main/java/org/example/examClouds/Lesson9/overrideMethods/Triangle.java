package org.example.examClouds.Lesson9.overrideMethods;

public class Triangle extends Figure {
    public Triangle(double dimension1, double dimension2) {
        super(dimension1, dimension2);
    }

    public double calculateArea() {
        System.out.println("In triangle area.");
        return dimension1 * dimension2 / 2;
    }

}
