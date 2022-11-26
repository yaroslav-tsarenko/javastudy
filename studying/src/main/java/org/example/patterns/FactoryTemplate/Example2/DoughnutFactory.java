package org.example.patterns.FactoryTemplate.Example2;


import java.util.Random;

public class DoughnutFactory {
    private Integer cherryDoughnutCount = 0;
    private Integer chocolateDoughnutCount = 0;
    private Integer almondDoughnutCount = 0;

    public static void main(String[] args) {
        DoughnutFactory factory = new DoughnutFactory();
        for (int i = 0; i < 100; i++) {
            eatRandomDoughnut(factory);
        }
        factory.printCount();
    }

    public static Doughnut getRandomDoughnut(DoughnutFactory factory){
        Random random = new Random();
        DoughnutTypes type = DoughnutTypes.values()[random.nextInt(DoughnutTypes.values().length)];

        return(factory.getDoughnut(type));
    }

    public static void eatRandomDoughnut(DoughnutFactory factory) {
        Doughnut randomDoughnut = getRandomDoughnut(factory);
        System.out.printf("What a surprise! ");
        randomDoughnut.eat();
    }

    public Doughnut getDoughnut(DoughnutTypes type) {
        Doughnut toReturn = null;
        switch (type) {
            case CHERRY:
                cherryDoughnutCount++;
                toReturn = (Doughnut) new CherryDoughnut();
                break;
            case CHOCOLATE:
                chocolateDoughnutCount++;
                toReturn = (Doughnut) new ChocolateDoughnut();
                break;
            case ALMOND:
                almondDoughnutCount++;
                toReturn = (Doughnut) new AlmondDoughnut();
                break;
            default:
                throw new IllegalArgumentException("Wrong doughnut type:" + type);
        }
        return toReturn;
    }

    public void printCount() {
        System.out.println("Number of doughnuts produced (by type):");
        System.out.println("Cherry doughnuts: " + cherryDoughnutCount);
        System.out.println("Chocolate doughnuts: " + chocolateDoughnutCount);
        System.out.println("Almond doughnuts: " + almondDoughnutCount);
        System.out.println("Total: " + (cherryDoughnutCount + chocolateDoughnutCount + almondDoughnutCount));
    }

}



