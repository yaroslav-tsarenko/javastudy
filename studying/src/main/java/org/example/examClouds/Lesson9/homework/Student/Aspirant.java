package org.example.examClouds.Lesson9.homework.Student;

public class Aspirant extends Student{
    private double averageMark;
    private String firstName;
    private String lastName;
    private int group;

    public Aspirant(String firstName, String lastName, int group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    public Aspirant(double averageMark) {
       this.averageMark = averageMark;
    }

    @Override
    public double getScholarship() {
        return averageMark == 5 ? 200 : 180;
    }

}
