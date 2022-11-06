package org.example.object.toString;

public class ExampleOfToString {
    public static void main(String[] args) {

        Person tom = new Person("Tom");
        System.out.println(tom.toString()); // Output: Person@7960847b
    }
}

class Person {

    private String name;

    public Person(String name) {

        this.name = name;
    }
}

class OverrideMethodOfToString{
    public static void main(String[] args) {

        Person1 tom = new Person1("Tom");
        System.out.println(tom.toString()); //Output  Person Tom
    }
}
class Person1 {

    private String name;

    public Person1(String name){

        this.name=name;
    }

    @Override
    public String toString(){

        return "Person " + name;
    }
}
