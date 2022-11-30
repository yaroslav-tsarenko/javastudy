package org.example.examClouds.variables;

public class ExampleWithIntAndDouble {
    public static void main(String[] args) {
        int a = 7;
        double b = 0.0;
        double c = -0.0;
        double g = Double.NEGATIVE_INFINITY;

        System.out.println(a / b);
        System.out.println(a / c);
        System.out.println(b == c);
        System.out.println(g * 0);
    }
}

class Test {
    public static void main(String[] args) {
        double d1 = 67.876; //коми ставити не можна тільки точку
        System.out.print(d1);
    }
}

class ExampleWithStringAndInt {

    String str1 = "Hello!";
    String str2 = "Hi!";

    public static void main(String[] args) {
        int x; // переменная x доступна всему коду из метода main ( )
        x = 10;
        if (x == 10) { // начало новой области действия,
            int у = 20;
            //int x = 45; // ОШИБКА! Во внутреннем блоке кода нельзя
            // объявлять переменные с тем же именем, что и во внешней области действия.
            //обе переменные х и у доступны в этой области действия
            System.out.println(" x и у : " + x + " " + у);
            x = у * 2;
        }
        // y = 100; // ОШИБКА! переменная у недоступна
        // в этой области действия
        // переменная х доступна и эдесь
        System.out.println(" x равно " + x);
    }
}

class ExampleWithVar{
        public static void main(String[] args) {
            var i = 6;
            var d = 7.8;
            var s = "some String";
            System.out.println(i);
            System.out.println(d);
            System.out.println(s);
        }
}
