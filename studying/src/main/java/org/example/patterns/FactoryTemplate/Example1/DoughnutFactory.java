package org.example.patterns.FactoryTemplate.Example1;

public class DoughnutFactory {
    public Doughnut getDoughnut(DoughnutTypes type) {
        Doughnut toReturn = null;
        switch (type) {
            case CHERRY:
                toReturn = new CherryDoughnut();
                break;
            case CHOCOLATE:
                toReturn = new ChocolateDoughnut();
                break;
            case ALMOND:
                toReturn = new AlmondDoughnut();
                break;
            default:
                throw new IllegalArgumentException("Wrong doughnut type:" + type);
        }
        return toReturn;
    }
}
