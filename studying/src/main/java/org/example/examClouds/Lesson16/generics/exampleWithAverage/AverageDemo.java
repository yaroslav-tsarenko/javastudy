package org.example.examClouds.Lesson16.generics.exampleWithAverage;


public class AverageDemo {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        Average<Integer> integerAverage = new Average<>(intArray);
        System.out.println("Average number " + integerAverage.averageMethod());

        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7};
        Average<Double> doubleAverage = new Average<>(doubleArray);
        System.out.println("Average number " + doubleAverage.averageMethod());
    }
}
