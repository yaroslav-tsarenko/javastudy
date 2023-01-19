package org.example.collections.EqualsAndHashCodeMethods;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCodeExample1 {
    public static void main(String[] args) {
        Map<Student, Double> map = new HashMap<>();
        Student st1 = new Student("Jake","Poll",3);
        Student st2 = new Student("Patrick","Bateman",1);
        Student st3 = new Student("Tyler","Derden",4);
        map.put(st1, 7.5);
        map.put(st2, 8.7);
        map.put(st3, 9.2);
        System.out.println(map);

        Student st4 = new Student("Jake","Poll",3);
        Student st5 = new Student("Poll","Allan",4);
     /*   boolean result = map.containsKey(st4);
        System.out.println("result = " + result);*/
        System.out.println(st1.hashCode());
        System.out.println(st4.hashCode());
    }

}

class Student{
    String name;
    String surname;
    int course;

    public Student(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, course);
    }

/*    @Override
    public int hashCode(){
        return name.length() * 7 + surname.length() * 11 + course * 53;
    }*/

}
