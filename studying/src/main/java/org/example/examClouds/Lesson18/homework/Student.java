package org.example.examClouds.Lesson18.homework;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private String name;
    private int group;
    private int course;
    private int mark;

    public Student() {

    }

    public Student(String name, int group, int course, int mark) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group=" + group +
                ", course=" + course +
                ", mark=" + mark +
                '}';
    }
}
