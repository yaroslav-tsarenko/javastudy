package org.example.examClouds.Lesson9.getAndSet;

public class PersonDemo {
    public static void main(String[] args) {
        Person person = new Person();
        person.setFullName("Petrov Ivan Ivanovich");
        person.setAge(56);
        person.setRetired(false);

        System.out.println("Full name " + person.getFullName());
        System.out.println("Age " + person.getAge());
        System.out.println("Retired? " + person.isRetired());
    }
}
