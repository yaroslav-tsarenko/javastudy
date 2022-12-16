package org.example.examClouds.Lesson11.referenceCasting;

public class ArrayCasting {
    /**
     * Переходы между массивами и примитивными типами являются запрещенными:
     * @param
     */
    public static void main(String[] args) {
        int[] array = new int[5];
        //int someNumber = array;
        int someNumber = array[0];
    }
}
