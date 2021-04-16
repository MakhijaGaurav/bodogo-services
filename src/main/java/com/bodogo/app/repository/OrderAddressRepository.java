package com.bodogo.app.repository;

import com.bodogo.app.model.OrderAddress;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderAddressRepository extends JpaRepository<OrderAddress,Integer> {

}
