package org.example.examClouds.Lesson9.inheritance;

public class ColorBox extends Box6{
    String color;

    public ColorBox(int width, int depth, int height, String color){
        /**
         * Вызов метода super() должен быть всегда в первом операторе, выполняемом в теле конструктора подкласса.
         */
       super(width, depth, height);
       this.color = color;
    }

    public ColorBox() {
    }

}
