package com.tka.springboothibernateintegration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

import jakarta.persistence.Entity;

@SpringBootApplication
@EntityScan("com.tka.entity")
@ComponentScan("com.tka")
public class SpringboothibernateintegrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringboothibernateintegrationApplication.class, args);
		System.out.println("Program Running...");
	}

}
