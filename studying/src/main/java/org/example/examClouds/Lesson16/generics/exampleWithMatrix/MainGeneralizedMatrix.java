package org.example.examClouds.Lesson16.generics.exampleWithMatrix;

public class MainGeneralizedMatrix {
    public static void main(String[] args) {
        GeneralizedMatrix<Integer, Double, Byte> generalizedMatrix =
                new GeneralizedMatrix<>(new Integer[6], new Double[5], new Byte[6]);
        System.out.println(generalizedMatrix);
    }
}
