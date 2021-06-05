package com.kodilla.good.patterns.challenges.orderService;

import java.time.LocalDateTime;

public class Application {

    public static void main(String[] args) {
        User user = new User("Dominik", "Ber", "domber");
        Product product1 = new Product("Komputer", 1);
        LocalDateTime whenOrdered = LocalDateTime.of(2020, 9, 2, 10,0);

        OrderProcess orderProcess = new OrderProcess(new MailService(), new  ProductOrderService());
        orderProcess.process(user, product1, whenOrdered);
    }
}
