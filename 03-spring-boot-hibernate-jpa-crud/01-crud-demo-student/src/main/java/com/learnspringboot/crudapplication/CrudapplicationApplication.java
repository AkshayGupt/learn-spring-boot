package com.learnspringboot.crudapplication;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CrudapplicationApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudapplicationApplication.class, args);
	}

	// Executed after Springs beans have been created
	@Bean
	public CommandLineRunner commandLineRunner(String [] args){
		// Lambda exp
		return runner -> {
			System.out.println("Hello World");
		};
	}

}
