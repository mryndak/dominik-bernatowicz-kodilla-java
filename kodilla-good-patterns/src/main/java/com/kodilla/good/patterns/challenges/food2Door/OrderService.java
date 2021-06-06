package com.kodilla.good.patterns.challenges.food2Door;

import java.time.LocalDateTime;

public interface OrderService {
    boolean buy(Uzytkownik uzytkownik, Produkt produkt, LocalDateTime kiedyZakupione);
}
