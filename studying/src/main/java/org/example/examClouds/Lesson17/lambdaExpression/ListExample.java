package org.example.examClouds.Lesson17.lambdaExpression;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    private static class Student {
        final private int age;
        final private String name;

        public Student(int age, String name) {
            this.age = age;
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public String getName() {
            System.out.println(1);
            return name;
        }

    }

    public static void main(String[] args) {
        final List<Student> students = new ArrayList<>() {{
            add(new Student(36, "Abdul"));
            add(new Student(35, "abcd"));
            add(new Student(34, "b"));
            add(new Student(33, "c"));
            add(new Student(32, null));

        }};
/*        int counter = 0;
        for (Student student: students) {
            if(student.age > 30 && student.name == null || student.name.length() <= 4){
                counter++;
            }
        }*/

        long count = students
                .stream()
                .filter(student -> student.age > 30)
               // .map(student -> student.name)
                .filter(student ->
                        student.name == null || student.name.length() <= 4)
                .count();
        System.out.println(count);

    }
}
