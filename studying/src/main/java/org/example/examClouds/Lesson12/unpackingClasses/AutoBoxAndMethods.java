package org.example.examClouds.Lesson12.unpackingClasses;

public class AutoBoxAndMethods {
    /**
     * Автоупаковку можно использовать при вызове метода:
     * @param
     */
    static int someMethod(Integer value) {
        return value;
    }

    public static void main(String[] args) {
        Integer iOb = someMethod(100);
        System.out.println(iOb);
    }
}
