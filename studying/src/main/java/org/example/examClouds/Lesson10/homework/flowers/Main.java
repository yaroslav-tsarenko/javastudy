package org.example.examClouds.Lesson10.homework.flowers;

public class Main {
    public static void main(String[] args) {
        Flower[] firstBouquet = new Flower[4];
        firstBouquet[0] = new Carnation("Italy", 14, 3);
        firstBouquet[1] = new Carnation("Italy", 14, 3);
        firstBouquet[2] = new Carnation("Italy", 14, 3);
        firstBouquet[3] = new Carnation("Italy", 14, 3);
        sumPrice(firstBouquet, 3);

        Flower[] secondBouquet = new Flower[3];
        secondBouquet[0] = new Rose("Monaco", 7, 5);
        secondBouquet[1] = new Rose("Monaco", 7, 5);
        secondBouquet[2] = new Rose("Monaco", 7, 5);
        sumPrice(secondBouquet, 5);

        Flower[] thirdBouquet = new Flower[3];
        thirdBouquet[0] = new Tulip("Ukraine", 10, 2);
        thirdBouquet[1] = new Tulip("Ukraine", 10, 2);
        thirdBouquet[2] = new Tulip("Ukraine", 10, 2);
        sumPrice(thirdBouquet, 2);
        System.out.println("Total sold flowers: " + Flower.count);


    }

    public static int sumPrice(Flower[] o, int price){
        int x = 0;
        for (int i = 0; i < o.length; i++) {
             x = price * o.length;
        }
        System.out.println(x);
        return price;
    }
}
