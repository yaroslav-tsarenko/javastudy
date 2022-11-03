package org.example.generics.covarianceAndContravariance;

import java.util.ArrayList;

public class Main {
    static class Fruit {
        int weight;
    }

    static class Citrus extends Fruit {
        int weight;
    }

    static class Orange extends Citrus {
        int color;
    }

    static class BigRoundOrange extends Orange {
        int size = 100;
    }

    private static int totalWeight(ArrayList<? extends Citrus> oranges) {
        int weight = 0;
        for (int i = 0; i < oranges.size(); i++) {
            weight += oranges.get(i).weight;
        }
        Fruit fruit = oranges.get(0);
        return weight;
    }

    private static void addOranges(ArrayList<? super Orange> oranges){
        for (int i = 0; i < 10; i++) {
            oranges.add(new Orange());
        }
        oranges.add(new BigRoundOrange());
    }

    public static void main(String[] args) {
        Fruit fruit = new Fruit();
        Citrus citrus = new Citrus();
        Orange orange = new Orange();

        citrus = orange;
        fruit = citrus;
        fruit = orange;

        ArrayList<Citrus> citrusList = new ArrayList<>();

        fruit = citrusList.get(0);
        citrus = citrusList.get(0);

        ArrayList<Orange> orangeList = new ArrayList<>();

        totalWeight(citrusList);

        addOranges(citrusList);
        citrusList.add(new Orange());
    }
}
