package com.kodilla.good.patterns.challenges.food2Door;

public class ProduktShowService implements ShowService{

    public void showProdukts(Produkty produkty){
        System.out.println(produkty.wyswietl());
    }
}
