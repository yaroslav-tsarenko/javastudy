package org.example.examClouds.Lesson11.interfaceIntroduction.interfaceInheritance;

public interface Football extends Sport, TVProgram {
    void homeTeamScored(int points);

    void visitingTeamScored(int points);

    void endOfQuarter(int quarter);
}
