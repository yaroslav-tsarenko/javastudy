package org.example.oop.inheritance;

public class Doctor extends Employee {
    private int mCategory;

    public Doctor(String fullName, long date, long salary, int category) {
        super(fullName, date, salary);
        mCategory = category;
    }

    @Override
    public double getSalaryUah(){
        return mSalary / 100f * 1.2;
    }
}
