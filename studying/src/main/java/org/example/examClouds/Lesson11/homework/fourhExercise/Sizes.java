package org.example.examClouds.Lesson11.homework.fourhExercise;

public enum Sizes {
    XS(34), S(36), M(38), L(40), XL(42);

    public final int XXS = 32;

    private int euroSize;

    public String getDescription() {
        String humanSize = "Human's size";
        return humanSize;
    }

    public String getDescriptionChild(){
        String XXS = "Child's size";
        return XXS;
    }


    Sizes(int euroSize) {
        this.euroSize = euroSize;
    }

    public int getEuroSize() {
        return euroSize;
    }

    public void setEuroSize(int euroSize) {
        this.euroSize = euroSize;
    }
}
