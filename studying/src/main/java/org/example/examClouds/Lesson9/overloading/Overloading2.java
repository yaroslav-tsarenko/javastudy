package org.example.examClouds.Lesson9.overloading;

public class Overloading2 {
    void test() {
        System.out.println("Без параметров");
    }
    //неправильная перегрузка методов
   /* int test() {
        System.out.println("Без параметров");
        return 1;
    }*/

    double test(double a) {
        System.out.println("double a: " + a);
        return a * a;
    }

    public static void main(String[] args) {
        Overloading2 ob = new Overloading2();

        ob.test();
        double result = ob.test(123.25);
        System.out.println("Результат вызова метода ob.test(123.25): " + result);
    }
}

/**
 * В следующем примере методы void test() и double test(double a) возвращают значения разного типа.
 * Это допустимо, но при условии, что параметры методов будут отличаться.
 * Закомментированный метод int test() отличается от void test() только типом - это недопустимо для перегруженного метода.
 * Если его добавить, будет ошибка компиляции:
 */