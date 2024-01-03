package com.shoestore.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.shoestore")
@EntityScan("com.shoestore.entity")
@EnableJpaRepositories("com.shoestore.repository")
public class Prj321xAsm3Sangntfx31391Application {

	public static void main(String[] args) {
		SpringApplication.run(Prj321xAsm3Sangntfx31391Application.class, args);
	}

}
