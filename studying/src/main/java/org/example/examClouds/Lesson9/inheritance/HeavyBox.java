package org.example.examClouds.Lesson9.inheritance;

import org.jetbrains.annotations.NotNull;

public class HeavyBox implements Comparable{
    int weight;
    int height;
    int depth;
    int width;

    public HeavyBox() {
    }

    public HeavyBox(int width, int height, int depth, int weight) {
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "HeavyBox{" +
                "weight=" + weight +
                ", height=" + height +
                ", depth=" + depth +
                ", width=" + width +
                '}';
    }

    @Override
    public int compareTo(@NotNull Object o) {
        return 0;
    }

    double getCapacity() {
        return width * weight * height * depth;
    }
}
