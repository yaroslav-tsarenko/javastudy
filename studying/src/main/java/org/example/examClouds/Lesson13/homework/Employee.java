package org.example.examClouds.Lesson13.homework;

import java.time.LocalDate;
import java.time.Month;

public class Employee {
    private String fullName;
    private float salary;
    private LocalDate salaryDate;

    public Employee(String fullName, float salary) {
        this.fullName = fullName;
        this.salary = salary;
    }


    public Employee(String fullName, float salary, LocalDate salaryDate) {
        this.fullName = fullName;
        this.salary = salary;
        this.salaryDate = salaryDate;
    }

    public Employee() {

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

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public LocalDate getSalaryDate() {
        return salaryDate;
    }

    public void setSalaryDate(LocalDate salaryDate) {
        this.salaryDate = salaryDate;
    }



    @Override
    public String toString() {
        int a = 1000;
        System.out.printf("Employees salary: %.2f", salary + '\n');
        return '\n' + "Date of salary:  " + salaryDate;
    }
}
