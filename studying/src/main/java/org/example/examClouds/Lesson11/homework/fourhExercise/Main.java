package org.example.examClouds.Lesson11.homework.fourhExercise;


public class Main {
    public static void main(String[] args) {
        Clothes[] clothes = new Clothes[4];
        clothes[0] = new Tie(32, 400, "black");
        clothes[1] = new TShirt(34, 500, "white");
        clothes[2] = new Skirt(36, 600, "red");
        clothes[3] = new Trousers(40, 700, "grey");

        for (int i = 0; i < clothes.length; i++) {
            System.out.println(clothes[i]);
        }

        Atelier atelier = new Atelier();
        atelier.wearMan(clothes);
        atelier.wearWoman(clothes);
    }
}
