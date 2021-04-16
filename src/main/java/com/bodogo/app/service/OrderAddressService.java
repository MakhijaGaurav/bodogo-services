package com.bodogo.app.service;

import com.bodogo.app.model.OrderAddress;
import com.bodogo.app.repository.OrderAddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderAddressService {

    @Autowired
    private OrderAddressRepository repository;

    public OrderAddress saveOrderAddress(OrderAddress orderAddress){
        return repository.save(orderAddress);
    }
}
