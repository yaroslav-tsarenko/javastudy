package org.example.examClouds.Lesson10.homework.circle;

import org.example.examClouds.Lesson9.superMethod.C;

public class Circle {
    int radius;
    final double PI = 3.14;

    public Circle(int radius) {
        this.radius = radius;
    }

    public static void main(String[] args) {
    Circle[] circles = new Circle[5];
    circles[0] = new Circle(3);
    circles[1] = new Circle(5);
    circles[2] = new Circle(7);
    circles[3] = new Circle(8);
    circles[4] = new Circle(10);
    for (Circle c : circles){
        c.circleLength();
        c.circleArea();
    }



    }

    public  void circleArea(){
        double result = radius * radius * PI;
        System.out.println(Math.round(result));
    }

    public  void circleLength(){
     double result = 2 * PI * radius;
        System.out.println(Math.round(result));
    }

}
