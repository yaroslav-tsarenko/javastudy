package org.example.examClouds.Lesson9.inheritance;

public class Box6 {
    public String weight;
    double width;
    double height;
    double depth;

    Box6(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    public Box6() {
    }

    double getCapacity() {
        return width * height * depth;
    }
}
