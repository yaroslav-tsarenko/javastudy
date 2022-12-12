package org.example.examClouds.Lesson9.abstractMethod;

import org.example.examClouds.Lesson9.overrideMethods.Figure;

public class FindAreas {
    public static void main(String[] args) {
        Figure2[] figures = new Figure2[2];
        figures[0] = new Rectangle2(10, 10);
        figures[1] = new Triangle2(10, 10);
        for (Figure2 figure : figures) {
            double area = figure.calculateArea();
            System.out.println(area);
        }
    }
}
