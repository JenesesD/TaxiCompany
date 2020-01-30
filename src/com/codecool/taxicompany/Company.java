package com.codecool.taxicompany;

import java.util.ArrayList;
import java.util.List;

public class Company implements PhoneNumberProvider {
    private List<Car> cars = new ArrayList<>();
    private List<Driver> drivers = new ArrayList<>();
    private List<Integer> phoneNumbers;

    @Override
    public List<Integer> getPhoneNumbers() {
        return phoneNumbers;
    }

}
