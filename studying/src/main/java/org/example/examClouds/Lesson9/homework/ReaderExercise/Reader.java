package org.example.examClouds.Lesson9.homework.ReaderExercise;

public class Reader {
    private String SFP;
    private int numberOfTicket;
    private String faculty;
    private int dateOfBirth;
    private int numberOfPhone;

    public Reader(String SFP, int numberOfTicket, String faculty, int dateOfBirth, int numberOfPhone) {
        this.SFP = SFP;
        this.numberOfTicket = numberOfTicket;
        this.faculty = faculty;
        this.dateOfBirth = dateOfBirth;
        this.numberOfPhone = numberOfPhone;
    }

    public Reader(){

    }

    public void takeBook(int takenBooks, String namePerson) {
        System.out.println(namePerson + " took " + takenBooks);
    }

    public void takeBook(String name, String... books) {
        System.out.println(name + " took " + books + " ");
    }

    public void takeBook(String name, int... books) {
        System.out.println(name + " took " + books);
    }

    public void returnBook(String name, int... books) {
        System.out.println(name + " took " + books);
    }

    public void returnBook(String name, String... books) {
        System.out.println(name + " took " + books + " ");
    }

    public void returnBook(int takenBooks, String namePerson) {
        System.out.println(namePerson + " took " + takenBooks);
    }

    public String getSFP() {
        return SFP;
    }

    public void setSFP(String SFP) {
        this.SFP = SFP;
    }

    public int getNumberOfTicket() {
        return numberOfTicket;
    }

    public void setNumberOfTicket(int numberOfTicket) {
        this.numberOfTicket = numberOfTicket;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getNumberOfPhone() {
        return numberOfPhone;
    }

    public void setNumberOfPhone(int numberOfPhone) {
        this.numberOfPhone = numberOfPhone;
    }
}
