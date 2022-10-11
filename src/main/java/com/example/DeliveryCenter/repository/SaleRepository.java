package com.example.DeliveryCenter.repository;

import com.example.DeliveryCenter.model.Person;
import com.example.DeliveryCenter.model.Sale;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SaleRepository extends CrudRepository<Sale, Integer> {

}
