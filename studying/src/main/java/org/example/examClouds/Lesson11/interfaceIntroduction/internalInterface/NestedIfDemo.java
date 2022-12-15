package org.example.examClouds.Lesson11.interfaceIntroduction.internalInterface;

public class NestedIfDemo {
    public static void main(String[] args) {
        A.NestedIf nif = new B();
        if (nif.isNotNegative(10)) {
            System.out.println("Number 10 is not negative.");
        }
        if (nif.isNotNegative(-12)) {
            System.out.println("It won't output.");
        }
    }
}
