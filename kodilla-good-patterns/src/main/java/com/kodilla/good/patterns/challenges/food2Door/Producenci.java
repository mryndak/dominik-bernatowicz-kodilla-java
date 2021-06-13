package com.kodilla.good.patterns.challenges.food2Door;

import java.util.HashMap;

public class Producenci {
    HashMap<Produkt, Producent> producenci;

    public Producenci(OrderService orderService, ShowService showService) {
        this.producenci = new HashMap<>();

        ExtraFoodShop extraFoodShop = new ExtraFoodShop(orderService, showService);
        HealthyShop healthyShop = new HealthyShop(orderService, showService);
        GlutenFreeShop glutenFreeShop = new GlutenFreeShop(orderService,showService);

        producenci.put(new Produkt("Sałatka z awokado", 1), extraFoodShop);
        producenci.put(new Produkt("Sałatka owocowa", 3), extraFoodShop);
        producenci.put(new Produkt("Koktajl warzywny", 2), extraFoodShop);
        producenci.put(new Produkt("Pomidory", 10), healthyShop);
        producenci.put(new Produkt("Kapusta", 4), healthyShop);
        producenci.put(new Produkt("Marchew", 9), healthyShop);
        producenci.put(new Produkt("Bezglutenowe musli", 1), glutenFreeShop);
        producenci.put(new Produkt("Bezglutenowe musli z owocami",8), glutenFreeShop);
        producenci.put(new Produkt("Bezglutenowe musli z czekolada", 5), glutenFreeShop);


    }

    public HashMap<Produkt, Producent> getProducenci() {
        return producenci;
    }

    public Producent getProducent(Produkt produkt){
        if (producenci.containsKey(produkt)) {
            return producenci.get(produkt);
        }

        throw new ProducentNotFindException();
    }
}
