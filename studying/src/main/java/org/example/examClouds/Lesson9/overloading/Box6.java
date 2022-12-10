package org.example.examClouds.Lesson9.overloading;

public class Box6 {
    double width;
    double height;
    double depth;

    Box6(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    Box6() {
        width = -1;  // используем -1 для
        height = -1; // обозначения непроинициализированной
        depth = -1;  // коробки
    }

    Box6(double len) {
        width = len;
        height = len;
        depth = len;
    }

    double getVolume() {
        return width * height * depth;
    }
}

/**
 * Конструкторы похожи на методы, поэтому они тоже могут быть перегружены - вы можете объявлять в одном классе несколько
 * конструкторов, которые различаются количеством и типом переменных. В следующем примере добавлены три конструктора в
 * класс Box6. Конечно же, при создании объекта вызывается только один из них - тот, который кажется вам наиболее
 * подходящим:
 */
