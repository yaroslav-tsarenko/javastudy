package org.example.examClouds.Lesson9.homework.Student;

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Aspirant("Amina", "Aminovna", 5, 5.0);
        students[1] = new Student("Kiril", "Antonov", 4, 3.5);
        students[2] = new Student(4.5);
        Aspirant aspirant = new Aspirant(4.5);
        System.out.println(aspirant.getScholarship());
        Student student = new Student(3);
        System.out.println(student.getScholarship());


    }
}
