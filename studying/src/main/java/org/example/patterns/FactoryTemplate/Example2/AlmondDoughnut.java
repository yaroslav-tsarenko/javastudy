package org.example.patterns.FactoryTemplate.Example2;

import org.example.patterns.FactoryTemplate.Example1.Doughnut;

public class AlmondDoughnut implements Doughnut {
    @Override
    public void eat() {
        System.out.println("You are eating Almond doughnut!");
    }
}
