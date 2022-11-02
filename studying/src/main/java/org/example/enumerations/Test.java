package org.example.enumerations;

public class Test {

    public static void main(String[] args) {
    //    Animal animal = Animal.CAT;
      //  System.out.println(animal.toString());

        Season season = Season.WINTER;
        System.out.println(season.getTemperature());

/*        switch (animal){
            case CAT:
                System.out.println("It's a cat");
                break;
            case DOG:
                System.out.println("It's a dog");
                break;
            case FROG:
                System.out.println("It's a frog");
                break;
        }

        Season season = Season.SUMMER;

        *//* Object -> Enum -> Season(Our created Enum)*//*
        System.out.println(season instanceof Season);
        switch(season){
            case SUMMER:
                System.out.println("It's hot outside");
                break;
            case WINTER:
                System.out.println("It's cold outside");
                break;
            case SPRING:
                System.out.println("It's warm outside");
                break;
            case AUTUMN:
                System.out.println("It's rainy outside");
                break;
        }
    }*/

    }
}
