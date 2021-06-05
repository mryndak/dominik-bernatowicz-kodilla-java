package com.kodilla.good.patterns.challenges.orderService;

import java.time.LocalDateTime;

public class ProductOrderService implements OrderService {

    public boolean buy(final User user, final Product product, final LocalDateTime kiedyZakupione){
        System.out.println("Kupione przez: " + user.getLogin() + "\nPrzedmiot: " + product.getName() +
                "\nData: " + kiedyZakupione);

        return true;
    }
}