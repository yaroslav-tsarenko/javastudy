package org.example.examClouds.Lesson16.homework;

public class AnonymousClassPrintable {
    public static void main(String[] args) {
        Printable printable = new Printable() {
            @Override
            public void print() {
            }
        };
        AnonymousClassPrintable anonymousClassPrintable = new AnonymousClassPrintable();
        anonymousClassPrintable.array();
    }

    public void array(){
        int[] array = new int[5];
        array[0] = 3;
        array[1] = 4;
        array[2] = 5;
        array[3] = 6;
        array[4] = 7;
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
