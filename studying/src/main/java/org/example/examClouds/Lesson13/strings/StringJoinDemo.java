package org.example.examClouds.Lesson13.strings;

public class StringJoinDemo {
    /**
     * В версию JDK 8 в класс String был внедрен новый метод join(), предназначенный для соединения двух и более символьных строк, разграничиваемых указанным разделителем, например, пробелом или запятой:
     * @param
     */
    public static void main(String[] args) {
        String result = String.join(":", "foobar", "foo", "bar");
        System.out.println(result);
    }
}