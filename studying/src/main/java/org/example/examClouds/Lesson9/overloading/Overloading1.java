package org.example.examClouds.Lesson9.overloading;

public class Overloading1 {
    void test(int a) {
        System.out.println("a: " + a);
    }

    void test(int a, int b) {
        System.out.println("a and b: " + a + " " + b);
    }

    public static void main(String[] args) {
        Overloading1 ob = new Overloading1();

        ob.test(10);
        ob.test(10, 20);
    }
}

/**
 * В Java разрешается в одном и том же классе определять
 * два или более метода с одним именем, если только объявления их параметров отличаются.
 * Это называется перегрузкой методов.
 */