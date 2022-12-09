package org.example.examClouds.Lesson9.object;

public class BoxDemo1 {
    public static void main(String[] args) {
        Box myBox = new Box();
        // присвоить значение переменным экземпляра mybox
        myBox.width = 10;
        myBox.height = 20;
        myBox.depth = 15;
        // рассчитать объем параллелепипеда
        double volume = myBox.width * myBox.height * myBox.depth;
        System.out.println("Объем равен " + volume);
    }
}
