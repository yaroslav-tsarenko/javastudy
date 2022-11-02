package org.example.enumerations;

public class JavaEnum {
    private static final int DOG = 0;
    private static final int CAT = 1;
    private static final int FROG = 2;

    public static void main(String[] args) {

        int animal = 100;

        switch (animal){
            case DOG:
                System.out.println("It's a dog");
                break;
            case FROG:
                System.out.println("It's a frog");
            break;
            default:
                System.out.println("It's not an animal");
        }
    }
}
