package org.example.oop.polimorphism;

public class Cat extends Animal{
    @Override
    public void eat(){
        System.out.println("Cat is eating...");
    }
    public void drink(){
        System.out.println("Cat is drinking...");
    }
}
