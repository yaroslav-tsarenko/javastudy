package org.example.exersices.LearningJava.oopExercise;

public class GoodDog {
    public int size;

    public int getSize() {
        return size;
    }

    public void setSize(int s) {
        s = size;
    }

    void bark(){
        if(size > 60){
            System.out.println("Gav gav");
        } else if (size > 14) {
            System.out.println("woof woof");
        }else {
            System.out.println("tf tf");
        }
    }
}
