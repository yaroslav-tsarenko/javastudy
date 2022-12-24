package org.example.examClouds.Lesson16.generics.exampleWithMatrix;

import java.util.Arrays;

public class GeneralizedMatrix<T, V, K> {
    private T[] arrayT;
    private V[] arrayV;
    private K[] arrayK;

    public GeneralizedMatrix(T[] arrayT, V[] arrayV, K[] arrayK) {
        this.arrayT = arrayT;
        this.arrayV = arrayV;
        this.arrayK = arrayK;
    }

    public T[] getArrayT() {
        return arrayT;
    }

    public void setArrayT(T[] arrayT) {
        this.arrayT = arrayT;
    }

    public V[] getArrayV() {
        return arrayV;
    }

    public void setArrayV(V[] arrayV) {
        this.arrayV = arrayV;
    }

    public K[] getArrayK() {
        return arrayK;
    }

    public void setArrayK(K[] arrayK) {
        this.arrayK = arrayK;
    }

    @Override
    public String toString() {
        return "GeneralizedMatrix{" +
                "arrayT=" + Arrays.toString(arrayT) +
                ", arrayV=" + Arrays.toString(arrayV) +
                ", arrayK=" + Arrays.toString(arrayK) +
                '}';
    }
}
