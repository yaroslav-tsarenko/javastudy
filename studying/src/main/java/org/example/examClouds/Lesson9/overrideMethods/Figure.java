package org.example.examClouds.Lesson9.overrideMethods;

public class Figure {

    double dimension1;
    double dimension2;

    public Figure(double dimension1, double dimension2) {
        this.dimension1 = dimension1;
        this.dimension2 = dimension2;
    }

    public double calculateArea() {
        System.out.println("Area is not find.");
        return 0;
    }
}

/**
 * Создадим класс Figure, описывающий какую-то абстрактную фигуру и классы наследники Triangle и Rectangle. Класс Figure
 * содержит метод calculateArea(), подсчитывающий площадь фигуры. У каждой фигуры своя формула для подсчета площади,
 * поэтому в классах Triangle и Rectangle метод calculateArea() переопределяется соответствующим образом:
 */
