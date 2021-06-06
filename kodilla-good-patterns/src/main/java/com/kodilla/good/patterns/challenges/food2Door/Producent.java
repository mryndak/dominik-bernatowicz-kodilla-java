package com.kodilla.good.patterns.challenges.food2Door;

import java.time.LocalDateTime;

public class Producent {

    private OrderService orderService;
    private ShowService showService;

    public Producent(OrderService orderService, ShowService showService) {
        this.orderService = orderService;
        this.showService = showService;
    }

    public OrderDto process(final Uzytkownik uzytkownik, final Produkt produkt, final LocalDateTime kiedyZakupione){
        boolean isBought = orderService.buy(uzytkownik, produkt, kiedyZakupione);
        if(isBought){
            return new OrderDto(uzytkownik, true);
        } else {
            return new OrderDto(uzytkownik, false);
        }
    }

    public void showProdukts(Produkty produkty) {
        showService.showProdukts(produkty);
    }
}
