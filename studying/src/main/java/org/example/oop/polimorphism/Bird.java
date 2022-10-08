package org.example.oop.polimorphism;

public class Bird extends Animal{
    @Override
    public void eat(){
        System.out.println("Bird is eating...");
    }

    public void drink(){
        System.out.println("Bird is drinking...");
    }
}
