package org.example.examClouds.Lesson9.object;

public class Box {
    double width;
    double height;
    double depth;

    /**
     * Подсчитать объем коробки
     *
     * @return Объем
     */
    double getVolume() {
        return width * height * depth;
    }

    /**
     * Установить размер коробки
     *
     * @param w - ширина
     * @param h - высота
     * @param d - глубина
     */
    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
    /**
     * Кроме переменных класс может содержать методы. В следующем примере в класс Box добавляется два метода: getVolume() -
     * для вычисления объема коробки и setDim() - для установки размера коробки. Обратите внимание,
     * что теперь мы объявляем методы нестатические (без ключевого слова static). В обоих методах мы имеем доступ к переменным класса.
     */
}
