package org.example.examClouds.Lesson9.superMethod;

public class C {
    public int i;
    public void print() {
        System.out.println("C.i = " + i);
    }
}

 class D extends C {
    public String i;

    public D(String a, int b) {
        i = a;
        super.i = b;
    }

    public void print() {
        System.out.println("D.i = " + i);
        super.print();
    }
}


 class UseSuper {
    public static void main(String[] args) {
        D d = new D("someString", 2);
        d.print();
        System.out.println(d.i);
    }
}

/**
 * Похожая ситуация и с методами. В обоих классах определен метод print().
 * Если мы хотим из класса D вызвать метод print() класса С, используем слово super - super.print().
 */

class Building {
    Building() {
        System.out.print("b ");
    }

    Building(String name) {
        this();
        System.out.print("bn " + name);
    }
}

 class House extends Building {
    House() {
        System.out.print("h ");
    }

    House(String name) {
        this();
        System.out.print("hn " + name);
    }

    public static void main(String[] args) {
        new House("x ");
    }
}

class Toy {
    public void printName() {
        System.out.println("Toy");
    }
}

class Doll extends Toy {
    public void printName() {
        super.printName();
        System.out.println("Doll");
    }
}

class TestToys {
    public static void main(String[] args) {
        Toy doll = new Doll();
        doll.printName();
    }
}

