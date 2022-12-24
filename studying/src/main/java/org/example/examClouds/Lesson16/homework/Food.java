package org.example.examClouds.Lesson16.homework;

import org.example.examClouds.Lesson9.superMethod.C;

public class Food {
    public static void main(String[] args) {
        Cookable cookable = new Cookable() {
            @Override
            public void cook(String str) {
                System.out.println("Cooking... " + str);
            }
        };
        Food food = new Food();
        food.prepare(cookable, "Pizza");
    }

    public void prepare(Cookable c, String str){
        c.cook(str);
    }
}
