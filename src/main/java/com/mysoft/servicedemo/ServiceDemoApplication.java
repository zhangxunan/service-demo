package com.mysoft.servicedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ServiceDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceDemoApplication.class, args);
	}
}
