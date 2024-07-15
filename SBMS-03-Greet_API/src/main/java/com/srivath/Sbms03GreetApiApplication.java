package com.srivath;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Sbms03GreetApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(Sbms03GreetApiApplication.class, args);
	}

}