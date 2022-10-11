package com.example.DeliveryCenter.repository;

import com.example.DeliveryCenter.model.Order;
import com.example.DeliveryCenter.model.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends CrudRepository<Order, Integer> {

}
