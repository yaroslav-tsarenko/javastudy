package org.example.object.getClass;



public class ExampleOfGetClass {
    public static void main(String[] args) {
        Person Tom = new Person("Tom");
        System.out.println(Tom.getClass());
    }

}

class Person{
    private String name;
    public Person(String name){
        this.name = name;
    }

}
