package org.example.examClouds.Lesson9.homework.PhoneExercise;

public class Phone {
    private int number;
    private String model;
    private int weight;

    public Phone(int number, String model, int weight) {
     this(number, model);
    }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }


    public Phone(){

    }

    public void receiveCall(String name, String number){
        System.out.print(name);
        System.out.print(number);
    }

   static void sendMessage(int... number){
       System.out.println(number.length);
       for (int n : number) {
           System.out.println(n + " ");
       }
       System.out.println();
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
