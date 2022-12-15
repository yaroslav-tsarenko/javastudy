package org.example.examClouds.Lesson11.interfaceIntroduction.interfaceInheritance;

public interface Hockey extends Sport {
    void homeGoalScored();

    void visitingGoalScored();

    void endOfPeriod(int period);

    void overtimePeriod(int ot);
}
