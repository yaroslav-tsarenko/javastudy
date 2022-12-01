package org.example.examClouds.Lesson4.logicalOperators;

public class LogicBoolean {
        public static void main(String[] args) {
            boolean a = true;
            boolean b = false;
            boolean c = a | b;
            boolean d = a & b;
            boolean e = a ^ b;
            boolean f = (!a & b) | (a & !b);
            boolean g = !a;
            System.out.println("a = " + a);
            System.out.println("b = " + b);
            System.out.println("a | b = " + c);
            System.out.println("a & b = " + d);
            System.out.println("a ^ b = " + e);
            System.out.println("(!a & b) | (a & !b) = " + f);
            System.out.println("!a = " + g);
        }
}

class LogicBoolean2 {
    public static void main(String[] args) {
        int d = 0;
        int num = 10;
        if (d != 0 && num / d > 10) {
            System.out.println("num = " + num);
        }
    }
}

/*
    Если нам надо сравнить возможный диапазон значений для какой-то переменной, например - a<x<b, такое условие
     разбивается на два: a<x &&x<b:
*/
class LogicBoolean3 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int x = 3;
        System.out.print(a < x && x < b);
        // System.out.print(a < x < b);//Ошибка компиляции
    }
}

class LogicBoolean4 {
    public static void main(String[] args) {
        boolean b1 = true;
        boolean b2 = false;
        System.out.println(b1 == b2);
        System.out.println(b1 != b2);
    }
}

/*
    Также существуют операции с присваиванием для AND, OR, XOR. Посмотрим пример:
*/
class LogicBoolean5 {
    public static void main(String[] args) {
        boolean b1 = true;
        boolean b2 = true;
        b1 &= b2;//равносильно b1 = b1 & b2;
        System.out.println(b1);
        b1 |= b2; //равносильно b1 = b1 | b2;
        System.out.println(b1);
        b1 ^= b2; //равносильно b1 = b1 ^ b2;
        System.out.println(b1);
    }
}

