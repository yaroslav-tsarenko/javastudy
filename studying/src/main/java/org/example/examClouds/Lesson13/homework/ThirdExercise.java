package org.example.examClouds.Lesson13.homework;

public class ThirdExercise {
    public static void main(String[] args) {
        replacement("Object-oriented programming is a programming " +
                "language model organized around objects rather " +
                "than \"actions\" and data rather than logic. " +
                "Object-oriented programming blabla. " +
                "Object-oriented programming bla.", "Object-oriented programming", "OOP");
    }

    public static void replacement(String words, String deleteWord, String replacingWord){
        System.out.println(words.replace(deleteWord, replacingWord));
    }
}
