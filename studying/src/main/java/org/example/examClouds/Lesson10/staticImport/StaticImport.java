package org.example.examClouds.Lesson10.staticImport;

import static java.lang.Math.PI;
import static java.lang.Math.cos;

public class StaticImport {
    public static void main(String[] args) {
        double value = cos(PI * 4);
        System.out.println(value);
    }
}
