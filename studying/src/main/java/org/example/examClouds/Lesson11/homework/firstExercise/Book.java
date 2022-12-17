package org.example.examClouds.Lesson11.homework.firstExercise;

public class Book implements Printable{

    private String name;

    public Book(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println(getName());
    }


    public void printBook() {
        System.out.println("Book" + getName());
    }


    public static void printBooks(Printable[] printable) {

    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                '}';
    }

}
