package org.example.examClouds.variables;

public class Main {
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

class Test{
    public static void main(String[] args) {
        double d1 = 67.876; //коми ставити не можна тільки точку
        System.out.print(d1);
    }
}
