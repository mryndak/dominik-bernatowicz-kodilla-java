package com.kodilla.patterns.strategy.social;

public class TwitterPublisher implements SocialPublisher{
    @Override
    public String shere() {
        return "Twitter";
    }
}
