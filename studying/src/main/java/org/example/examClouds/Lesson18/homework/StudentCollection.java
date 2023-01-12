package org.example.examClouds.Lesson18.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class StudentCollection {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student("Oleg", 3, 5, 2));
        students.add(new Student("Amina", 6, 2, 3));
        students.add(new Student("Arina", 2, 3, 5));
        students.add(new Student("Alex", 1, 1, 2));

        List<Student> polishedStudents = polishStudents(students);

        for (Student student : students) {
            System.out.println(student);
        }
    }

    public static List<Student> polishStudents(List<Student> students) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getMark() < 3) {
                iterator.remove();
            }
        }
        return students;
    }

}
