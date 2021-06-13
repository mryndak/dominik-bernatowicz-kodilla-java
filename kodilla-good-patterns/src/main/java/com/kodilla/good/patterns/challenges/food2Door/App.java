package com.kodilla.good.patterns.challenges.food2Door;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.HashSet;

public class App {

    public static void main(String[] args) {
        //stan Producentów
        Producenci producenci = new Producenci(new ProduktOrderService(), new ProduktShowService());

        //zamówienie
        Uzytkownik uzytkownik = new Uzytkownik("Dominik", "Ber", "domber");
        Produkt produkt1 = new Produkt("kapusta", 1);
        LocalDateTime whenOrdered = LocalDateTime.of(2020, 9, 2, 10,0);

    }
}
