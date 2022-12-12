package org.example.examClouds.Lesson9.abstractMethod;

public abstract class Figure2 {
    double dimension1;
    double dimension2;

    public Figure2(double dimension1, double dimension2) {
        this.dimension1 = dimension1;
        this.dimension2 = dimension2;
    }

    public abstract double calculateArea();
}
