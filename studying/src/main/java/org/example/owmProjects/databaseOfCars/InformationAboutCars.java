package org.example.owmProjects.databaseOfCars;

public class InformationAboutCars {
    private String EngineCapacity;
    private String Color;
    private String Price;
    private String Model;

    @Override
    public String toString() {
        return  Model + " " + '\'' +
                "EngineCapacity='" + EngineCapacity + '\'' +
                ", Color='" + Color + '\'' +
                ", Price='" + Price + '\'';
    }

    public InformationAboutCars(String engineCapacity, String color, String price, String model){
        EngineCapacity = engineCapacity;
        Color = color;
        Price = price;
        Model = model;
    }
}
