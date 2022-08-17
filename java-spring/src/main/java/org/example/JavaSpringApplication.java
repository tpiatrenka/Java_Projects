package org.example;

import org.example.entity.Apple;
import org.example.repository.AppleRepository;
import org.example.repository.JdbcConnector;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class JavaSpringApplication {

	public static void main(String[] args) {

		SpringApplication.run(JavaSpringApplication.class, args);
		JdbcConnector connector = new JdbcConnector();
		AppleRepository repository = new AppleRepository(connector);
		List<Apple> apples = repository.getAll();
		for (Apple apple: apples) {
			System.out.println(apple);
		}
	}

}
