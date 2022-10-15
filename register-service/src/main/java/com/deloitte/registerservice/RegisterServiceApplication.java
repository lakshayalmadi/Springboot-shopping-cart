package com.deloitte.registerservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class RegisterServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegisterServiceApplication.class, args);
	}

}
