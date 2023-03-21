package com.eoi.ProyectoSpring;

import com.eoi.ProyectoSpring.entities.Customer;
import com.eoi.ProyectoSpring.repositories.CustomerRepository;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.time.LocalDateTime;

@SpringBootApplication
public class ProyectoSpringApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoSpringApplication.class, args);
	}

	@Autowired
	CustomerRepository customerRepository;

	@Test
	void contextLoads() {
	}

	@Override
	public void run(String... args) throws Exception {

		Customer customer = new Customer("Pepe", "Lopez", "Alegria",
				LocalDate.of(1982, 5, 9),
				LocalDateTime.now());


		customerRepository.save(customer);
	}
}
