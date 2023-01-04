package org.example.examClouds.Lesson18.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentCollection {

    public static void main(String[] args) {

        Student student = new Student();
        List<Student> students = Collections.singletonList(new Student());

        students.add(new Student("Oleg", 3, 5, 2));
        students.add(new Student("Amina", 6, 2, 3));
        students.add(new Student("Arina", 2, 3, 5));
        students.add(new Student("Alex", 1, 1, 2));


    }

    public static void removeWithBadMark(List<Student> students) {

    }

}
