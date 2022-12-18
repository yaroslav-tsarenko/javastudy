package org.example.examClouds.Lesson12.expansionTypes;

public class AddVarargs {
    /**
     * Между расширением примитивных типов и var-args всегда проигрывает var-args:
     * @param
     */
    public static void go(int x, int y) {
        System.out.println("int, int");
    }

    public static void go(byte... x) {
        System.out.println("byte... ");
    }

    public static void main(String[] args) {
        byte b = 5;
        go(b, b); // какой go() вызовется?
    }
}