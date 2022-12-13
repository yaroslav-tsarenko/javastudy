package org.example.examClouds.Lesson9.homework.PersonExercise;

public class Person {
    private int age;
    private String fullName;

    public Person(int age, String fullName) {
        this.age = age;
        this.fullName = fullName;
    }

    public Person(){

    }

    public void talk(String name){
        System.out.println(name + " talking");
    }

    public void move(String name){
        System.out.println(name + " moving");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
