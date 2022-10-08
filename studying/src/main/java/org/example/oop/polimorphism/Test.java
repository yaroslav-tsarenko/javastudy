package org.example.oop.polimorphism;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();
        Bird bird = new Bird();

        test(animal);
        test(dog);
        test(cat);
        test(bird);
    }

    public static void test(Animal animal) {
      //  animal.eat();
        animal.drink();
    }

}
