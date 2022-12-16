package org.example.examClouds.Lesson11.referenceCasting;

public class ArrayCasting2 {
    /**
     * Массив, основанный на примитивном типе, принципиально нельзя преобразовать к типу массива, основанному на ссылочном типе, и наоборот:
     * @param
     */
    public static void main(String[] args) {
        Integer[] array1 = new Integer[4];
        int[] array2 = new int[4];
        //  array1 = array2;
        //  array2 = array1;
    }
}
