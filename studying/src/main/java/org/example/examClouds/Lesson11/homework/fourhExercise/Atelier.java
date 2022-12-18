package org.example.examClouds.Lesson11.homework.fourhExercise;

public class Atelier {
    private Clothes Skirt;
    private Clothes Tie;

    public void wearMan(Clothes[] clothes){
        for (int i = 0; i < clothes.length; i++) {
            if (clothes[i] == Tie){
                System.out.println(Tie);
            }else {
                System.out.println("There is no man's clothes in array");
            }
        }
    }

    public void wearWoman(Clothes[] clothes){
        for (int i = 0; i < clothes.length; i++) {
            if (clothes[i] == Skirt){
                System.out.println(Skirt);
            }else {
                System.out.println("There is no woman's clothes in array");
            }
        }
    }
}
