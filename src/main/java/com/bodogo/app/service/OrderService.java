package com.bodogo.app.service;

import com.bodogo.app.model.Order;
import com.bodogo.app.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    private OrderRepository repository;

    public Order saveOrder(Order order){
        return repository.save(order);
    }
}
