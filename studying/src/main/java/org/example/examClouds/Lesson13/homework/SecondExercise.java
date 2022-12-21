package org.example.examClouds.Lesson13.homework;

public class SecondExercise {
    public static void main(String[] args) {
        addNumbers(3, 56);
    }
    public static void addNumbers(int a, int b){
        StringBuilder sb = new StringBuilder();
        sb.append(a).append(" + ").append(b).append(" = ").append(a + b).append("\n")
                .append(a).append(" - ").append(b).append(" = ").append(a - b).append("\n")
                .append(a).append(" * ").append(b).append(" = ").append(a * b).append("\n");
        System.out.println("Before delete: ");
        System.out.println(sb);
        sb.delete(6,8);
        sb.insert(6, " equals");
        sb.delete(23,25);
        sb.insert(23, " equals");
        sb.delete(42, 44);
        sb.insert(42, "equals ");
        System.out.println("After delete: ");
        System.out.println(sb);
    }
}
