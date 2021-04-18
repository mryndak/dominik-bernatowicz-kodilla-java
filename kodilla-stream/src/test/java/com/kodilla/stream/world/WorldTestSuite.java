package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity() {

        //Given
        BigDecimal x1 = new BigDecimal("111111111");
        BigDecimal x2 = new BigDecimal("222222222");
        BigDecimal x3 = new BigDecimal("333333333");
        BigDecimal x4 = new BigDecimal("444444444");
        World world = new World();
        Continent continent1 = new Continent();
        Continent continent2 = new Continent();
        Country country1 = new Country(x1);
        Country country2 = new Country(x2);
        Country country3 = new Country(x3);
        Country country4 = new Country(x4);
        world.addContinent(continent1);
        world.addContinent(continent2);
        continent1.addCountry(country1);
        continent1.addCountry(country2);
        continent2.addCountry(country3);
        continent2.addCountry(country4);

        //When
        BigDecimal peopleQuantity = world.getPeopleQuantity();

        //Than
        BigDecimal expectedPeopleQuantity = new BigDecimal("1111111110");
        assertEquals(expectedPeopleQuantity, peopleQuantity);
    }
}
