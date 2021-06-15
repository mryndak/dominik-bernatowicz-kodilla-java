package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.CorporateCustomer;
import com.kodilla.patterns.strategy.Customer;
import com.kodilla.patterns.strategy.IndividualCustomer;
import com.kodilla.patterns.strategy.IndividualYoungCustomer;
import com.kodilla.patterns.strategy.predictors.AggressivePredictor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {
    @Test
    void testDefaultSharingStrategies() {
        //Given
        User jan = new Millenials("Jan P");
        User pawel = new YGeneration("Pawel S");
        User dominik = new ZGeneration("Dominik B");

        //When
        String janShouldShere = jan.social();
        System.out.println("Steven should: " + janShouldShere);
        String pawelShouldShere = pawel.social();
        System.out.println("John should: " + pawelShouldShere);
        String dominikShouldShere  = dominik.social();
        System.out.println("Kodilla should: " + dominikShouldShere);

        //Then
        assertEquals("Facebook", janShouldShere);
        assertEquals("Twitter", pawelShouldShere);
        assertEquals("Snapchat", dominikShouldShere);
    }

    @Test
    void testIndividualSharingStrategy() {
        //Given
        User dominik = new Millenials("Dominik B");

        //When
        String dominikShouldShere  = dominik.social();
        System.out.println("Dominik should shere: " + dominikShouldShere);
        dominik.setSocial(new SnapchatPublisher());
        dominikShouldShere = dominik.social();
        System.out.println("Steven now should: " + dominikShouldShere);

        //Then
        assertEquals("Snapchat", dominikShouldShere);
    }
}
