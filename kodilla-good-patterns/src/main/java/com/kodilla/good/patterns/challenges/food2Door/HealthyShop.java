package com.kodilla.good.patterns.challenges.food2Door;

import java.time.LocalDateTime;

public class HealthyShop implements Producent{

    public OrderService orderService;
    public ShowService showService;

    public HealthyShop(OrderService orderService, ShowService showService) {
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
}
