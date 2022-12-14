package org.example.examClouds.Lesson9.homework.Figures;

public class Circle extends Shape{
    public double dimension1;
    public double dimension2;

    public Circle(double dimension1, double dimension2) {
        this.dimension1 = dimension1;
        this.dimension2 = dimension2;
    }

    public double calculateArea() {
        System.out.println("In circle area.");
        double result = dimension1 * dimension2 * dimension2;
        System.out.println(result);
        return result;
    }

    public void draw(){
        System.out.println("Red");
    }
}
