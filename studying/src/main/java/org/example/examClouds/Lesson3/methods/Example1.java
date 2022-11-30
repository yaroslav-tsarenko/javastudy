package org.example.examClouds.Lesson3.methods;

public class Example1 {
    static void print() {
        System.out.println("Print some info");
    }

    public static void main(String[] args) {
        print();
    }
}

class Example2 {
    public static void main(String[] args) {
        int x = sum(3, 4);
        System.out.println(x);

    }


    static int sum(int a, int b) {
        return (a + b);
    }
}


class Example3 {

    /*Метод getVolume принимает на вход три параметра типа double, а также возвращает значение типа double.
    Метод возвращает значение с помощью ключевого слова return:*/

    public static void main(String[] args) {
        double result = getVolume(4.5,5.5,7.7);
        System.out.println(result);
    }

    static double getVolume(double width, double height, double depth) {
        return width * height * depth;
    }
}

class Example4{
    /*Объявление и вызов метода Java*/
        public static void main(String[] args) {
            int x, y;
            x = square(5);
            System.out.println(x);
            x = square(9);
            System.out.println(x);
            y = 2;
            x = square(y);
            System.out.println(x);
        }

        public static int square(int i) {
            return i * i;
        }
}