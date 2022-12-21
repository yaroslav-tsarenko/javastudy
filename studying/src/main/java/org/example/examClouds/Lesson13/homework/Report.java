package org.example.examClouds.Lesson13.homework;

public class Report {

    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0] = new Employee("Karpenko", 3000f);
        employees[1] = new Employee("Tsarenko", 5000f);
        employees[2] = new Employee("Petrichenko", 1500f);
        generateReport(employees);
    }

    public static void generateReport(Employee[] employees){
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
    }

}
