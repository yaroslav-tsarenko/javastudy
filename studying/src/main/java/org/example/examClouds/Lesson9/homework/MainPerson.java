package org.example.examClouds.Lesson9.homework;

public class MainPerson {
    public static void main(String[] args) {
        Person christopher = new Person(32,"Christopher");
        System.out.println(christopher.getAge());
        System.out.println(christopher.getFullName());

        Person jake = new Person();
        jake.setAge(35);
        jake.setFullName("Jake");
        System.out.println(jake.getAge());
        System.out.println(jake.getFullName());

        christopher.move("Christopher");
        christopher.talk("Christopher");


    }
}
