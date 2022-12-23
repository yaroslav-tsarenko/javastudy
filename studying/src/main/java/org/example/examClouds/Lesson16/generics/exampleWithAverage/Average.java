package org.example.examClouds.Lesson16.generics.exampleWithAverage;

public class Average<T extends Number> {
    private T[] array;

    public Average(T[] array) {
        this.array = array;
    }

    public double averageMethod(){
        double sum = 0.0;
        for (T value : array){
            sum += value.doubleValue();
        }
        return sum / array.length;
    }
}
