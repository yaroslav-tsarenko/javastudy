package org.example.examClouds.Lesson9.homework.ReaderExercise;

public class MainReader {
    public static void main(String[] args) {
        Reader reader = new Reader();
        reader.setSFP("Petrov Patrick Petrovich");
        reader.setNumberOfTicket(4);
        reader.setFaculty("Math");
        reader.setDateOfBirth(25);
        reader.setNumberOfPhone(+380973582);
        reader.takeBook("Petrov", 4);
        reader.returnBook("Petrov", "Pushkin", "Gogol", "Shevchenko");

        System.out.println(reader.getSFP());
        System.out.println(reader.getNumberOfTicket());
        System.out.println(reader.getFaculty());
        System.out.println(reader.getDateOfBirth());
        System.out.println(reader.getNumberOfPhone());
        System.out.println(reader.getDateOfBirth());



    }
}
