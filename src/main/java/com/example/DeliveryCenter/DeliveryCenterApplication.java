package com.example.DeliveryCenter;

import com.example.DeliveryCenter.model.Person;
import com.example.DeliveryCenter.repository.PersonRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class DeliveryCenterApplication implements CommandLineRunner {
	private final PersonRepository personRepository;

	public DeliveryCenterApplication(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}


	public static void main(String[] args) {
		SpringApplication.run(DeliveryCenterApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}

}
