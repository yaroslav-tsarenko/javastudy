package org.example.examClouds.Lesson13.homework;

public class Employee {
    private String fullName;
    private float salary;

    public Employee(String fullName, float salary) {
        this.fullName = fullName;
        this.salary = salary;
    }

    public Employee(){

    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        int a = 1000;
        System.out.printf("Employees salary: %.2f", salary);
        System.out.println();
        return "Employees salary:  " + salary;
    }
}
