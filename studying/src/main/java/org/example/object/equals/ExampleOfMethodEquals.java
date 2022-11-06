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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;
        return Objects.equals(name, person.name);
    }

}
