package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.BuyPredictor;

public class User {
    private final String name;
    protected SocialPublisher socialPublisher;

    public String getName() {
        return name;
    }

    public User(String name) {
        this.name = name;
    }

    public String social() {
        return socialPublisher.shere();
    }

    public void setSocial(SocialPublisher socialPublisher) {
        this.socialPublisher = socialPublisher;
    }
}
