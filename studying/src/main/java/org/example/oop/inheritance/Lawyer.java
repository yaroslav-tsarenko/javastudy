package org.example.oop.inheritance;

public class Lawyer extends Employee{
    private String mDepartment;

    public Lawyer(String fullName, long date, long salary, String department){
        super(fullName, date, salary);
        mDepartment = department;
    }
}
