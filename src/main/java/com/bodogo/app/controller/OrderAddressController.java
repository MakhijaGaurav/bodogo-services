package com.bodogo.app.controller;

import com.bodogo.app.model.OrderAddress;
import com.bodogo.app.service.OrderAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderAddressController {
    @Autowired
    private OrderAddressService service;

    @PostMapping("order/address")
    public OrderAddress addOrderAddress(@RequestBody  OrderAddress orderAddress){
        return service.saveOrderAddress(orderAddress);
    }
}
