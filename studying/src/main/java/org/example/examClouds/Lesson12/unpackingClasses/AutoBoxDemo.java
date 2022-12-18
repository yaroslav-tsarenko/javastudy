package org.example.examClouds.Lesson12.unpackingClasses;

public class AutoBoxDemo {
    /**
     * Автоупаковка и распаковка это процесс преобразования примитивных типов в объектные и наоборот. Весь процесс выполняется автоматически средой выполнения Java (JRE).
     * @param
     */
    public static void main(String[] args) {
        Integer iOb = 100; // упаковать значение int
        int i = iOb; // распаковать
        System.out.println(i + " " + iOb);
    }
}