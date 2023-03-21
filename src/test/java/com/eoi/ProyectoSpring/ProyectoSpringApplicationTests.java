package com.eoi.ProyectoSpring;

import com.eoi.ProyectoSpring.entities.Customer;
import com.eoi.ProyectoSpring.repositories.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.LocalDateTime;

@SpringBootTest
class ProyectoSpringApplicationTests implements CommandLineRunner {

	@Autowired
	CustomerRepository customerRepository;

	@Test
	void contextLoads() {
	}

	@Override
	public void run(String... args) throws Exception {

		Customer customer = new Customer("Pepe", "Lopez","Alegria",
				LocalDate.of(1982,5,9),
				LocalDateTime.now());


		customerRepository.save(customer);

	}
}
