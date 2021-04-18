package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public final class Continent {

    private final List<Country> countryList = new ArrayList<>();

    public void addCountry(Country country) {
        countryList.add(country);
    }

    public List<Country> getCountryList() {
        return countryList;
    }
/*
    public BigDecimal getPeopleQuantity() {
        BigDecimal totalPeopleInContinent = BigDecimal.ZERO;
        for (Country countryPeople : countryList) {
            totalPeopleInContinent = totalPeopleInContinent.add(countryPeople.getPeopleQuantity());
        }
        return totalPeopleInContinent;
    }*/
}
