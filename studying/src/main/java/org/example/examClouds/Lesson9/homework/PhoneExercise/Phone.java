package org.example.examClouds.Lesson9.homework.PhoneExercise;

import java.util.Objects;

public class Phone {
    private int number;
    private String model;
    private int weight;
    static int count;

    public Phone(int number, String model, int weight) {
     this(number, model);
        count++;
    }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
        count++;

    }


    public Phone(){
        count++;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Phone phone)) return false;

        if (number != phone.number) return false;
        if (weight != phone.weight) return false;
        return Objects.equals(model, phone.model);
    }

    @Override
    public int hashCode() {
        int result = number;
        result = 31 * result + (model != null ? model.hashCode() : 0);
        result = 31 * result + weight;
        return result;
    }
}
