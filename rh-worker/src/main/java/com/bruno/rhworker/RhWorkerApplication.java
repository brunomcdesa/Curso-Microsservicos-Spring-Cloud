package com.bruno.rhworker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class RhWorkerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RhWorkerApplication.class, args);
	}

}
