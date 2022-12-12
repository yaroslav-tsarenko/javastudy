package org.example.examClouds.Lesson9.overrideMethods;

public class M {
    public int i;
    public int j;

    public M(int i, int j) {
        this.i = i;
        this.j = j;
    }

    public void print() {
        System.out.println("Method M i = " + i + " j = " + j);
    }
}

/**
 * В следующем примере в классе M определен метод print(). В его наследнике классе N тоже определен метод print() с
 * такой же сигнатурой, но другим поведением. Это и называется переопределением методов:
 */