package org.example.oop.inheritance;

public class Employee {
    private String mFullName;
    private long mEmploymentDate;
    protected long mSalary;

    public Employee (String fullName, long date, long salary){
        mFullName = fullName;
        mEmploymentDate = date;
        mSalary = salary;
    }

    public double getSalaryUah(){
        return mSalary / 100f;
    }
}
