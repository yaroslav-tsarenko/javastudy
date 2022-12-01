package org.example.examClouds.Lesson4.stringConcatination;

import java.util.Objects;

public class StringConcatenationFirstExample {
    public static void main(String[] args) {
        String str1 = "world";
        System.out.println("Hello " + str1);
        System.out.println("First line\n" + "Second line");
    }
}

class StringConcatenationSecondExample {
    public static void main(String[] args) {
        char x, y;
        x = 88;  // Код символа 'X'
        y = 'Y';
        System.out.println(x + " " + y); //Выведется X Y
        System.out.println(x + y); //Выведется 177
    }
}


class StringConcatenationThirdExample{
    public static void main(String[] args) {
        int x, y, b, c;
        x = 4;
        y = 2;
        b = 4 + 4 * 2;
        c = square(b);

        System.out.println("str=" + c);
    }

    public static int square(int i){
        return (i * i);
    }
}

class StringConcatenationFourthExample{
    public static void main(String[] args) {
        // Слово "Украина" в кодировке Unicode
        System.out.println("\u0423\u043A\u0440\u0430\u0438\u043D\u0430");
    }
}


/*
    Чтобы сравнить на равенство две строки, необходимо воспользоваться методом equals() или
    Objects.equals() (начиная с Java 7):
*/
class StringConcatenationFifthExample{
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hi";
        System.out.println(str1.equals(str2));
        System.out.println(Objects.equals(str1, str2));
    }
}

/*
    Длина строки определяется с помощью метода length():
*/

class StringConcatenationSixthExample{
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println("Длина строки: " + str.length());
    }
}

class Test{
    public static void main(String[] args) {
        long x = 42L;
        long y = 44L;
        System.out.print(" " + 7 + 2 + " ");
        System.out.print(foo() + x + 5 + " ");
        System.out.println(x + y + foo());
    }

    public static String foo() {
        return "foo";
    }
}


