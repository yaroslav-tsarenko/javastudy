package org.example.examClouds.Lesson9.object;

public class BoxDemo2 {
    public static void main(String[] args) {
        Box myBox1 = new Box();
        Box myBox2 = new Box();

        myBox1.setDim(10, 20, 15);
        myBox2.setDim(1, 5, 5);

        System.out.println("Объем: " + myBox1.getVolume());
        System.out.println("Объем: " + myBox2.getVolume());
    }
}
    /**
     * В следующей программе создаются два объекта класса Box и вместо инициализации каждой переменной класса,
     *   как мы делали ранее, вызывается метод setDim(), куда передаются необходимые значения для ширины, высоты и глубины.
     *   Таким образом программа становится более компактной. Нестатический метод класса
     *   всегда вызывается для какого-то объекта. Аналогично,
     *   для подсчета объема коробки вызываем метод getVolume() для каждого объекта отдельно:
     */


