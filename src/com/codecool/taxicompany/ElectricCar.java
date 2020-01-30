package com.codecool.taxicompany;

public class ElectricCar extends Car {
    private Driver driver;
    private int cost = 400;
    private int passangerCount = getCapacityByExperienceLevel().get(driver.getExperienceLevel());

    public ElectricCar(int id, int cost) {
        super(id, cost);
    }
}
