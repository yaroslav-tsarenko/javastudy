package org.example.generics.covarianceAndContravariance;

import java.util.ArrayList;

public class HumanHello {
    public static void main(String[] args) {
        Student s1 = new Student();
        Human h1 = s1;
        Object o1 = h1;

       /*Student s2 = (Student) new Human(); Contravariance
       System.out.println(((Student)h1).name);
        System.out.println(h1.name);*/

        ArrayList<? super Student> students = new ArrayList<>();
        ArrayList<Employee> employees = new ArrayList<>();

        students.add(new Student());
        students.add(new Employee());

        employees.add(new Employee());
        employees.add(new Employee());
        employees.add(new Employee());

        // students.add(new Human());
      /*ArrayList<Human> humans = students;
        ArrayList<Object> objects = strings;
        ArrayList<String> strings = new ArrayList<>();   --> Contravariance
        humans.add(new Human());*/

        print(students);
      //  print(employees);

    }

    public static void print(ArrayList<? super Student> list){
        list.forEach(System.out::println);
    }

}

class Human {
    String name = "Bob";
}

class Student extends Human {
    String name = "Bill";
    int id = 100;
}

class Employee extends Student {

}


