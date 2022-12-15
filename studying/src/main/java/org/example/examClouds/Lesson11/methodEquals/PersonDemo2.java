package org.example.examClouds.Lesson11.methodEquals;

public class PersonDemo2 {
    public static void main(String[] args) {
        Person person1 = new Person("Петров Иван Иванович", 56, false);
        Person person2 = new Person("Петров Иван Иванович", 54, false);
        Person person3 = person1;

        System.out.println("person1 == person2? " + (person1 == person2));
        System.out.println("person1 == person3? " + (person1 == person3));

        System.out.println("person1.equals(person2)? " + person1.equals(person2));
        System.out.println("person1.equals(person3)? " + person1.equals(person3));
    }
}
