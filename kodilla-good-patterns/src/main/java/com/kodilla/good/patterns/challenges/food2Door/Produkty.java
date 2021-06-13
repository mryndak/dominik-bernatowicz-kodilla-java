package com.kodilla.good.patterns.challenges.food2Door;

import java.util.HashMap;

public class Produkty {

    HashMap<String, Integer> produkty;

    public Produkty(HashMap<String, Integer> produktyy) {
        this.produkty = produktyy;
    }

    public HashMap<String, Integer> getProdukty() {
        return produkty;
    }

    public void addProdukty(Produkt produkt) {
        produkty.put(produkt.getName(), produkt.getQuantity());
    }

    public void wyswietl() {
        if (!produkty.isEmpty()) {
            System.out.println("Produkty    -   ilość ");
            produkty.forEach((s, integer) -> System.out.println(s + "      " + integer));
        } else {
            System.out.println("nie ma produktów");
        }
    }
}
