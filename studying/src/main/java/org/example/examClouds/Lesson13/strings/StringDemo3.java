package org.example.examClouds.Lesson13.strings;

public class StringDemo3 {
    /**
     * В классе String реализована группа методов, сравнивающих часть строки с подстрокой:
     * <li>Метод regionMatches() используется для сравнения подстроки в исходной строке с подстрокой в строке параметре.
     * <li>Метод startsWith() проверяет, начинается ли данная подстрока фрагментом, переданным методу в качестве параметра.
     * <li>Метод endsWith() проверяет, совпадает ли с параметром конец строки.
     * <li>Метод contains() проверяет, входит ли подстрока в строку
     * @param
     */
    public static void main(String[] args) {
        System.out.println("Foobar".endsWith("bar"));
        System.out.println("Foobar".startsWith("Foo"));
        System.out.println("Foobar".contains("oo"));
        System.out.println("Hello world!!!".regionMatches(6, "world", 0, 3));
    }
}
