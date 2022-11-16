package org.example.generics.types.AnotherExample;

import org.example.oop.polimorphism.Dog;

public class TestGenerics1 {
    public static void main(String[] args) {
        new TestGenerics1().go();

    }

    public void go(){
        Animal[] animals = {new Animal(), new Animal()};
        Dog[] dogs = {new Dog(), new Dog(), new Dog()};
        takeAnimals(animals);


    }
    public void takeAnimals(Animal[] animals){
        for(Animal a: animals){
            a.eat();
        }
    }
    class Animal{
        void eat(){
            System.out.println("Animal eating");
        }
        class Dog extends org.example.generics.types.AnotherExample.Animal {
            void bark(){

            }
        }

        class Cat extends org.example.generics.types.AnotherExample.Animal {
            void meow(){

            }
        }
    }
}


