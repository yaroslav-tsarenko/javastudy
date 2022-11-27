package org.example.patterns.SingletonTemplate.ImmutableExample;

import org.example.patterns.SingletonTemplate.ImmutableExample.ImmutableCat;

public class TestImmutable {
    public static void main(String[] args) {
        ImmutableCat first = new ImmutableCat("Bengal", "green");
        ImmutableCat second = first.setBreed("Sphynx");
    }
}
