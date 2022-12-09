package org.example.examClouds.Lesson9.object;

public class BoxDemo6 {
    public static void main(String[] args) {
        Box b1 = new Box();
        Box b2 = b1;

        b1.width = 10;
        b1.height = 20;
        b1.depth = 15;

        b2.width = 3;

        System.out.println("Width: " + b1.width);
        System.out.println("Width: " + b2.width);
    }
}

/**
 * При объявлении переменной b1 создается новый объект в памяти.
 * При объявлении переменной b2, вместо создания нового объекта, переменной присваивается ссылка на объект b1.
 * Далее объекту, на который указывает переменная b1, присваиваются значения 10, 20, 30. А ширине объекта,
 * на который указывает переменная b2, присваивается значение 3:
 */