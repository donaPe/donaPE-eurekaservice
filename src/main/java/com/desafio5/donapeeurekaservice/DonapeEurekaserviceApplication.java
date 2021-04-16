package com.desafio5.donapeeurekaservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DonapeEurekaserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DonapeEurekaserviceApplication.class, args);
	}

}
