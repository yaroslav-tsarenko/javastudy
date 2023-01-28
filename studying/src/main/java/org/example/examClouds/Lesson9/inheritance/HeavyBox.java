package org.example.examClouds.Lesson9.inheritance;

public class HeavyBox implements Comparable{
    int weight;
    int height;
    int depth;
    int width;

    public HeavyBox() {
    }

    public HeavyBox(int weight, int height, int depth, int width) {
        this.weight = weight;
        this.height = height;
        this.depth = depth;
        this.width = width;
    }

    public int getWeight(){
        return weight;
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


    public double getCapacity() {
        return width * weight * height * depth;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
