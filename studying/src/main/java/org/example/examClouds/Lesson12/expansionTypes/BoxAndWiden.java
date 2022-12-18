package org.example.examClouds.Lesson12.expansionTypes;

public class BoxAndWiden {
    /**
     * Можно упаковать, а потом расширить. Значение типа int может стать Object, через преобразование Integer.
     * @param
     */
    public static void go(Object o) {
        Byte b2 = (Byte) o;
        System.out.println(b2);
    }

    public static void main(String[] args) {
        byte b = 5;
        go(b); // можно ли преобразовать byte в Object?
    }
}
