package com.kodilla.good.patterns.challenges.food2Door;

import java.time.LocalDateTime;

public interface Producent {

    public OrderDto process(final Uzytkownik uzytkownik, final Produkt produkt, final LocalDateTime kiedyZakupione);
}
