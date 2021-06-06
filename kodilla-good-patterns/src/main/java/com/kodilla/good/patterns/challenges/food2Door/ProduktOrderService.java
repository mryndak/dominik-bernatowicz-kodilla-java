package com.kodilla.good.patterns.challenges.food2Door;

import java.time.LocalDateTime;

public class ProduktOrderService implements OrderService {

    public boolean buy(final Uzytkownik uzytkownik, final Produkt produkt, final LocalDateTime kiedyZakupione){
        System.out.println("Kupione przez: " + uzytkownik.getLogin() + "\nPrzedmiot: " + produkt.getName() +
                "\nData: " + kiedyZakupione);

        return true;
    }
}