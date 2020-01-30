package com.codecool.taxicompany;

public class GasolineCar extends Car{
    private Driver driver;
    private int maintenanceCost = 20;
    private int cost  = 350;
    private int passangerCount = getCapacityByExperienceLevel().get(driver.getExperienceLevel());


    public GasolineCar(int id, int cost) {
        super(id, cost);
    }

    public void increaseMaintenanceCost(){
        this.maintenanceCost *= 1.1;
    }
}
