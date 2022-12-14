package org.example.examClouds.Lesson9.homework.Figures;

public class Shape {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle(10, 10);
        shapes[1] = new Rectangle(15, 13);
        for (Shape s :  shapes) {
            s.draw();
            s.calculateArea();

        }
    }

    public double calculateArea() {
     return calculateArea();
    }

    public void draw(){

    }
}
