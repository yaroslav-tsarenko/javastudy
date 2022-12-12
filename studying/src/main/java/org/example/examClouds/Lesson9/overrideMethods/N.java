package org.example.examClouds.Lesson9.overrideMethods;

public class N extends M {
    public int k;

    public N(int i, int j, int k) {
        super(i, j);
        this.k = k;
    }

    public void print() {
        System.out.println("Метод N k = " + k);
    }

    public void someMethod() {
        print();
    }
}

/**
 * Когда переопределенный метод вызывается из своего подкласса, он всегда ссылается на свой вариант, определенный в
 * подклассе. А вариант метода, определенный в супер классе, будет скрыт. Из метода someMethod() будет вызван метод
 * того же класса N:
 */
