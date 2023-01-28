package org.example.object.equals;

import java.util.Objects;

public class ExampleOfMethodEquals {
    public static void main(String[] args) {
        Person tom = new Person("Tom");
        Person bob = new Person("Bob");
        System.out.println(tom.equals(bob)); // false

        Person tom2 = new Person("Tom");
        System.out.println(tom.equals(tom2)); // true
    }

}

class Person{
    String name;

    public Person(String name){
        this.name = name;

    }



}
