package com.example.anujBhaiya.SpringBootAnujBhaiya;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootAnujBhaiyaApplication implements CommandLineRunner {


	@Autowired
	DBService dbService;



	public static void main(String[] args) {
		SpringApplication.run(SpringBootAnujBhaiyaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hey I am spring boot");
		dbService.getData();
	}
}

