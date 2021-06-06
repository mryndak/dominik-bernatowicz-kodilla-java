package com.kodilla.good.patterns.challenges.food2Door;

import java.time.LocalDateTime;
import java.util.HashSet;

public class App {

    public static void main(String[] args) {
        //stan Producentów
        Producent extraFoodShop = new Producent(new ProduktOrderService(), new ProduktShowService());

        Produkty produktyEFS = new Produkty(new HashSet<>());
        Produkty produktyGFS = new Produkty(new HashSet<>());
        Produkty produktyHS = new Produkty(new HashSet<>());

        produktyEFS.produkty.add(new Produkt("Sałatka z awokado", 1));
        produktyEFS.produkty.add(new Produkt("Sałatka owocowa", 3));
        produktyEFS.produkty.add(new Produkt("Koktajl warzywny", 2));

        produktyGFS.produkty.add(new Produkt("Bezglutenowe musli", 1));
        produktyGFS.produkty.add(new Produkt("Bezglutenowe musli z owocami",8));
        produktyGFS.produkty.add(new Produkt("Bezglutenowe musli z czekolada", 5));

        produktyHS.produkty.add(new Produkt("Pomidory", 10));
        produktyHS.produkty.add(new Produkt("Kapusta", 4));
        produktyHS.produkty.add(new Produkt("Marchew", 9));

        //zamówienie
        Uzytkownik uzytkownik = new Uzytkownik("Dominik", "Ber", "domber");
        Produkt produkt1 = new Produkt("kapusta", 1);
        LocalDateTime whenOrdered = LocalDateTime.of(2020, 9, 2, 10,0);

        extraFoodShop.process(uzytkownik, produkt1, whenOrdered);
        System.out.println();
        extraFoodShop.showProdukts(produktyEFS);
    }
}
