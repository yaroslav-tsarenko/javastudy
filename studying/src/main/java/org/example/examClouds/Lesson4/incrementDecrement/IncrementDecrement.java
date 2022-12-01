package org.example.examClouds.Lesson4.incrementDecrement;

public class IncrementDecrement {
    public static void main(String[] args) {
        int a = 1;
        int b = a++;
        int c = ++a;
        c++;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}

class CharIncrement {
    public static void main(String[] args) {
        char ch = 'X';
        System.out.println("ch contains " + ch);
        ch++; // увеличиваем ch
        System.out.println("New value ch: " + ch);
    }
}


class VisitorTest {
    static int visitors = 0;

    public static void main(String[] args) {
        System.out.println("visitors online: " + visitors++);
        System.out.println("The number of visitors is " + visitors);
        System.out.println("The number of visitors is now " + ++visitors);
    }
}

