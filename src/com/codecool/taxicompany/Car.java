package com.codecool.taxicompany;

import java.util.HashMap;

public abstract class Car {
    private int id;
    private int cost;
    private HashMap<ExperienceLevel,Integer> capacityByExperienceLevel = new HashMap(){{
        put(ExperienceLevel.BEGGINER, 15);
        put(ExperienceLevel.ADVANCED, 25);
        put(ExperienceLevel.PROFESSIONAL, 40);
    }};

    public Car(int id, int cost) {
        this.id = id;
        this.cost = cost;
    }

    public HashMap<ExperienceLevel, Integer> getCapacityByExperienceLevel() {
        return capacityByExperienceLevel;
    }
}
