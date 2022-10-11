package com.example.DeliveryCenter.repository;

import com.example.DeliveryCenter.model.Client;
import com.example.DeliveryCenter.model.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends CrudRepository<Client, Integer> {

}
