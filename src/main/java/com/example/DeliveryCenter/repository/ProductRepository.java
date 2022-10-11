package com.example.DeliveryCenter.repository;

import com.example.DeliveryCenter.model.Person;
import com.example.DeliveryCenter.model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {

}
