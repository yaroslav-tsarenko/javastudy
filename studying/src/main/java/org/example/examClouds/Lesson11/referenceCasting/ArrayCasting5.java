package org.example.examClouds.Lesson11.referenceCasting;

import org.example.examClouds.Lesson9.inheritance.Box6;

import java.io.Serializable;

public class ArrayCasting5 {
    /**
     * Преобразования между массивами и другими объектными типами возможны только для класса Object и интерфейсов Cloneable и Serializable.
     * @param
     */
    public static void main(String[] args) {
        Box6[] array = new Box6[5];
        Object object = array;
        Cloneable cloneable = array;
        Serializable serializable = array;
    }
}
