package com.bodogo.app.controller;

import com.bodogo.app.model.Order;
import com.bodogo.app.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Autowired
    private OrderService service;

    @PostMapping("/order")
    public Order addOrder( @RequestBody Order order){
        return service.saveOrder(order);
    }

}
