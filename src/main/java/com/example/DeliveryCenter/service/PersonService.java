package com.example.DeliveryCenter.service;

import com.example.DeliveryCenter.model.Person;
import com.example.DeliveryCenter.repository.PersonRepository;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    private PersonRepository repository;

    public PersonService(PersonRepository repository) {
        this.repository = repository;
    }

    public void insert(Person person){
        repository.save(person);
    }
}
