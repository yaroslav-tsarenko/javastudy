package org.example.patterns.SingletonTemplate;

public class TestImmutable {
    public static void main(String[] args) {
        ImmutableCat first = new ImmutableCat("Bengal", "green");
        ImmutableCat second = first.setBreed("Sphynx");
    }
}
