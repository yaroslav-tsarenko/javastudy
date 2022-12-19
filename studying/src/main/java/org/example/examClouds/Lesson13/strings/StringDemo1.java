package org.example.examClouds.Lesson13.strings;

public class StringDemo1 {
    public static void main(String[] args) {
        String str1 = new String();
        System.out.println("str1:[" + str1 + "]"); //пустая строка

        char[] chars1 = {'а', 'b', 'с'};
        String str2 = new String(chars1);
        System.out.println("str2:" + str2); //строка из елементов массива

        char[] chars2 = {'a', 'b', 'с', 'd', 'e', 'f'};
        String str3 = new String(chars2, 2, 3); //берёться три елемента начиная с 2 символа
        System.out.println("str3:" + str3);

        String str4 = "abc";
        System.out.println("str4:" + str4);
        System.out.println("str4.length:" + str4.length());
        System.out.println("abc.length:" + "abc".length()); //вывод длины строки

        String str5 = new String(str4);
        System.out.println("str5:" + str5); //передаёться строка
    }
}
