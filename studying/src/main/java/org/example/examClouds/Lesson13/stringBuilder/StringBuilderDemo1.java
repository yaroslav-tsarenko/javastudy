package org.example.examClouds.Lesson13.stringBuilder;

public class StringBuilderDemo1 {
    /**
     * В следующем примере создадим объект класса StringBuilder, и выведем на консоль его размер методом length(). Метод capacity() возвращает размер буфера:
     * @param
     */
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Hello");

        System.out.println("string = " + stringBuilder);
        System.out.println("length = " + stringBuilder.length());
        System.out.println("capacity = " + stringBuilder.capacity());
    }
}
