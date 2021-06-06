package com.kodilla.good.patterns.challenges.food2Door;

import java.util.HashSet;

public class Produkty {

    HashSet<Produkt> produkty = new HashSet<>();

    public Produkty(HashSet<Produkt> produkty) {
        this.produkty = produkty;
    }

    public HashSet<Produkt> getProdukty() {
        return produkty;
    }

    public void setProdukty(HashSet<Produkt> produkty) {
        this.produkty = produkty;
    }

    public String wyswietl() {
        if (!produkty.isEmpty()) {
            String lol = new String();
            for (Produkt produkt : produkty) {
                lol += "Nazwa: " + produkt.getName() + ", ilość: " + produkt.getQuantity() + "\n";
            }
            return lol;
        } else {
            return "nie ma produktów";
        }
    }
}
