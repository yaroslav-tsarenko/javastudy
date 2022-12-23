package org.example.examClouds.Lesson16.generics.parameterizedMethod;

public class GenConstructorDemo {
    public static void main(String[] args) {
        GenConstructor genConstructor1 = new GenConstructor(100);
        GenConstructor genConstructor2 = new GenConstructor(123.5F);
        GenConstructor genConstructor3 = new GenConstructor(123.40);

        genConstructor1.showValue();
        genConstructor2.showValue();
        genConstructor3.showValue();
    }
}
