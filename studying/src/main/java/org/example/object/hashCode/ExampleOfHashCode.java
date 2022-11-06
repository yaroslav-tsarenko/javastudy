package org.example.object.hashCode;

public class ExampleOfHashCode {

    public static void main(String[] args) {
        Person tom = new Person("Tom");
        System.out.println(tom.hashCode());
    }
}

class Person {

    private String name;

    public Person(String name) {

        this.name = name;
    }

    @Override
    public int hashCode() {

        return 2359 * name.hashCode() + 45235;
    }
}

