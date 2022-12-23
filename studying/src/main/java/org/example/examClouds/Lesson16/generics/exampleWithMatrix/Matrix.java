package org.example.examClouds.Lesson16.generics.exampleWithMatrix;

import java.util.Arrays;

public class Matrix<T> {
    private T[] array;

    public Matrix(T[] array) {
        this.array = array.clone();
    }

    public static void main(String[] args) {
        Matrix<Double> doubleMatrix = new Matrix<>(new Double[2]);
        Matrix<Integer> integerMatrix = new Matrix<>(new Integer[4]);
        Matrix<Byte> byteMatrix = new Matrix<>(new Byte[7]);
        System.out.println(doubleMatrix + " " + integerMatrix + " " + byteMatrix);
    }

    @Override
    public String toString() {
        return "Matrix{" +
                "array=" + Arrays.toString(array) +
                '}';
    }

}


