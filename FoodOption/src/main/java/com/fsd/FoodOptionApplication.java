package com.fsd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
public class FoodOptionApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoodOptionApplication.class, args);
	}

}
