package org.example.examClouds.Lesson11.homework.firstExercise;

public class Main {

    public static void main(String[] args) {
        Printable[] printable = new Printable[6];
        printable[0] = new Book("Encyclopedic");
        printable[1] = new Book("Biology");
        printable[2] = new Book("Astronomy");
        printable[3] = new Magazine("Cars");
        printable[4] = new Magazine("Man");
        printable[5] = new Magazine("Woman");
        for (int i = 0; i < printable.length; i++) {
            printable[i].print();
        }

    }
}
