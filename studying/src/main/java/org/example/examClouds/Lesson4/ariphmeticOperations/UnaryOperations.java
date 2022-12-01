package org.example.examClouds.Lesson4.ariphmeticOperations;

public class UnaryOperations {
    public static void main(String[] args) {
        double a = -6;
        double b = +6;
        System.out.println(a);
        System.out.println(b);
    }
}

class OperationsWithSymbol{
        public static void main(String[] args) {
            char c = 'n';
            System.out.println(c);
            System.out.println(c + 1);
            System.out.println(c / 5);
        }
}

class OperationsWithSymbol2{
    public static void main(String[] args) {
        char c1 = '1';
        char c2 = '\u0031';
        char c3 = 49;
        System.out.println(c1 + c2 + c3);
    }
}

class DivisionByModule{
    public static void main(String[] args) {
        int a = 6 % 5;
        double b = 6.2 % 5.0;
        System.out.println(a);
        System.out.println(b);
    }
}

class CompoundOperations {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        a += 3;
        b *= 2;
        c += a * b;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
