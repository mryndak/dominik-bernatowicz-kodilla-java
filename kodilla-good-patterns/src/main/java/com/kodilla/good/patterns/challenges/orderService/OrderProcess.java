package com.kodilla.good.patterns.challenges.orderService;

import java.time.LocalDateTime;

public class OrderProcess {

    private Information information;
    private OrderService orderService;

    public OrderProcess(Information information, OrderService orderService) {
        this.information = information;
        this.orderService = orderService;
    }

    public OrderDto process(final User user, final Product product, final LocalDateTime kiedyZakupione){
        boolean isBought = orderService.buy(user, product, kiedyZakupione);
        if(isBought){
            information.inform(user);
            return new OrderDto(user, true);
        } else {
            return new OrderDto(user, false);
        }
    }
}
