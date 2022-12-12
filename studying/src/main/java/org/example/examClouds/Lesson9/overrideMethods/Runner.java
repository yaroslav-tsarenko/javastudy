package org.example.examClouds.Lesson9.overrideMethods;

public class Runner {
    public static void main(String[] args) {
        Base ob = new Sub();
        ob.go();
        Sub.go();
    }
}
