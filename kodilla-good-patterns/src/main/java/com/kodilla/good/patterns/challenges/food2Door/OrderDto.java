package com.kodilla.good.patterns.challenges.food2Door;

public class OrderDto {

    public Uzytkownik uzytkownik;
    public boolean isBought;

    public OrderDto(final Uzytkownik uzytkownik, final boolean isBought) {
        this.uzytkownik = uzytkownik;
        this.isBought = isBought;
    }

    public Uzytkownik getUser() {
        return uzytkownik;
    }

    public boolean isBought() {
        return isBought;
    }
}
