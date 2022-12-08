package org.example.examClouds.Lesson7.SwapMethod;

public class ChangeValues {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;

        int tmp = a;
        a = b;
        b = tmp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}

class ChangeValueWithArithmetic{
    public static void main(String[] args) {
        int a = 3;
        int b = 5;

        a = a + b; // a = 8, b = 5
        b = a - b; // a = 8, b = 3
        a = a - b; // a = 5, b = 3

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}


class Test{
    public static void main(String[] args) {
        String rabbit = "Rabbit";
        String lama = "Lama";
        String result;
        result = rabbit + " " + lama;
        System.out.println(result);
    }
}