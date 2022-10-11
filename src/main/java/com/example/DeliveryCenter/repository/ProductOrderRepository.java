package com.example.DeliveryCenter.repository;

import com.example.DeliveryCenter.model.Person;
import com.example.DeliveryCenter.model.ProductOrder;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductOrderRepository extends CrudRepository<ProductOrder, Integer> {

}
