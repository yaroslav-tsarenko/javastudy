package org.example.examClouds.Lesson9.varargs;

public class OverloadingVarArgs {
    static void test(double... array) {
        System.out.println("test(double... array)");
        System.out.println("amount of elements: " + array.length);
        for (double a : array) {
            System.out.print(a + " ");
        }
        System.out.println();
    }

    static void test(int... array) {
        System.out.println("test(int... array)");
        System.out.println("amount of elements: " + array.length);
        for (int a : array) {
            System.out.print(a + " ");
        }
        System.out.println();
    }

    static void test(int a) {
        System.out.println("test(int a)");
    }

    public static void main(String[] args) {
        test();
        test(3);
        test(1.0);
        test(1, 2);
    }
}

/**
 * При вызове метода без аргументов, подходят два метода - test(double... array) и test(int... array).
 * В этом случае будет вызван метод с меньшим диапазоном значений - test(int... array).
 * При вызове метода test() с одним значением типа int -  test(3), будет выбран метод test(int a).
 */