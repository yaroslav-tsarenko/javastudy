package org.example.enumerations;

public class UsefulMethods {
    public static void main(String[] args) {
       Season season = Season.AUTUMN;
        Animal animal = Animal.CAT;
        System.out.println(animal.name());

       Animal frog = Animal.valueOf("FROG");
        System.out.println(frog.getTranslation());
    }
}

class AnotherUsefulMethod{
    public static void main(String[] args) {
        Season winter = Season.WINTER;
        System.out.println(winter.ordinal());
    }
}
