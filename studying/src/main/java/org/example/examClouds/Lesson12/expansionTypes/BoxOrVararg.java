package org.example.examClouds.Lesson12.expansionTypes;

public class BoxOrVararg {
    /**
     * Упаковка и var-args совместимы с перегрузкой методов. Var-args всегда проигрывает:
     * @param
     */
    public static void go(Byte x, Byte y) {
        System.out.println("Byte, Byte");
    }

    public static void go(byte... x) {
        System.out.println("byte... ");
    }

    public static void main(String[] args) {
        byte b = 5;
        go(b, b); // какой go() вызовется?
    }
}
